package com.example.androidtrabalho2bim.Adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtrabalho2bim.ui.main.DetalhePessoa;
import com.example.androidtrabalho2bim.ui.main.Pessoa;
import com.example.trabalho2bimestre.R;

import java.util.ArrayList;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {
    ArrayList<Pessoa> lista;

    public AdapterList(ArrayList<Pessoa> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public AdapterList.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterList.ViewHolder viewHolder, @SuppressLint("RecyclerView") int position) {
        viewHolder.title.setText(lista.get(position).name);
        viewHolder.description.setText(lista.get(position).description);
        viewHolder.itemView.setOnClickListener(new View.onClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetalhePessoa.class);
                intent.putExtra("title", lista.get(position).name);
                intent.putExtra("description", lista.get(position).description);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.title);
            this.description = itemView.findViewById(R.id.description);

        }
    }
}


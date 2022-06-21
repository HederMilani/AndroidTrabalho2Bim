package com.example.androidtrabalho2bim.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtrabalho2bim.Adapter.AdapterList;
import com.example.androidtrabalho2bim.ui.main.Pessoa;
import com.example.trabalho2bimestre.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListItens#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class ListItens extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListItens.
     */
    // TODO: Rename and change types and number of parameters
    public static ListItens newInstance(String param1, String param2) {
        ListItens fragment = new ListItens();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public ListItens() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_itens, container, false);

        ArrayList<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Heder Milani", "Academico", "00134684", "Sistemas de Informação", "To precisando de nota Professor, me ajuda. kkkkkkk"));
        lista.add(new Pessoa("pessoinha 2", "esse é o perfil da pessoinha 2", "00000000", "Sistemas de Informação", "To precisando de nota Professor, me ajuda. kkkkkkk"));
        lista.add(new Pessoa("pessoinha 3", "esse é o perfil da pessoinha 3", "00000000", "Sistemas de Informação", "To precisando de nota Professor, me ajuda. kkkkkkk"));
        lista.add(new Pessoa("pessoinha 4", "esse é o perfil da pessoinha 4", "00000000", "Sistemas de Informação", "To precisando de nota Professor, me ajuda. kkkkkkk"));
        lista.add(new Pessoa("pessoinha 5", "esse é o perfil da pessoinha 5", "00000000", "Sistemas de Informação", "To precisando de nota Professor, me ajuda. kkkkkkk"));
        lista.add(new Pessoa("pessoinha 6", "esse é o perfil da pessoinha 6", "00000000", "Sistemas de Informação", "To precisando de nota Professor, me ajuda. kkkkkkk"));
        lista.add(new Pessoa("pessoinha 7", "esse é o perfil da pessoinha 7", "00000000", "Sistemas de Informação", "To precisando de nota Professor, me ajuda. kkkkkkk"));
        lista.add(new Pessoa("pessoinha 8", "esse é o perfil da pessoinha 8", "00000000", "Sistemas de Informação", "To precisando de nota Professor, me ajuda. kkkkkkk"));
        lista.add(new Pessoa("pessoinha 9", "esse é o perfil da pessoinha 9", "00000000", "Sistemas de Informação", "To precisando de nota Professor, me ajuda. kkkkkkk"));
        lista.add(new Pessoa("pessoinha 10", "esse é o perfil da pessoinha 10", "00000000", "Sistemas de Informação", "To precisando de nota Professor, me ajuda. kkkkkkk"));

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.recycler);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);
        AdapterList adapterList = new AdapterList(lista);
        rv.setAdapter(adapterList);
        rv.setHasFixedSize(true);
        return rootView;
    }
}
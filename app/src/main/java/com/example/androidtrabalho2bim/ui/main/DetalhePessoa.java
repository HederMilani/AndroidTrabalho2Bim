package com.example.androidtrabalho2bim.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.trabalho2bimestre.R;

public class DetalhePessoa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalha_pessoa);
        Intent i = getIntent();
        TextView nome = findViewById(R.id.title);
        TextView description = findViewById(R.id.description);
        nome.setText(i.getStringExtra("nome"));
        description.setText(i.getStringExtra("description"));
    }
}
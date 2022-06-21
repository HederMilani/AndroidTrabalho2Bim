package com.example.androidtrabalho2bim;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.View;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.view.ViewGroup;

import com.google.android.material.textfield.TextInputEditText;
import com.example.trabalho2bimestre.R;
import com.google.android.material.snackbar.Snackbar;


public class Calculator extends Fragment {

    // Na listaIntegrantes.java também tem ARG_NUM1 e 2 que foram moodificados para ARG_NUM1 e 2
    private static final String ARG_NUM1 = "num1";
    private static final String ARG_NUM2 = "num2";


    private String mNum1;
    private String mNum2;

    public Calculator() {
    }



    public static Calculator newInstance(String num1, String num2) {
        Calculator fragment = new Calculator();
        Bundle args = new Bundle();
        args.putString(ARG_NUM1, num1);
        args.putString(ARG_NUM2, num2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mNum1 = getArguments().getString(ARG_NUM1);
            mNum2 = getArguments().getString(ARG_NUM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        TextInputEditText note1 = view.findViewById(R.id.firstNote);

        TextInputEditText note2 = view.findViewById(R.id.secondNote);

        TextInputEditText note3 = view.findViewById(R.id.thirdNote);

        TextInputEditText note4 = view.findViewById(R.id.fourthNote);

        Button button = view.findViewById(R.id.calculateButton);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                FrameLayout rootlayout = (FrameLayout) view.findViewById(R.id.frameLayout);
                String message = "";
                int duration = Snackbar.LENGTH_LONG;

                Float f1 = Float.parseFloat(String.valueOf(note1.getText()));
                Float f2 = Float.parseFloat(String.valueOf(note2.getText()));
                Float f3 = Float.parseFloat(String.valueOf(note3.getText()));
                Float f4 = Float.parseFloat(String.valueOf(note4.getText()));

                Float media = (f1 + f2 + f3 + f4) / 4;

                String mediaString = Float.toString(media);

                if (media < 4) {
                    message = "O aluno foi reprovadon sua média foi de: " + mediaString;
                } else if (media >= 4 && media < 6){
                    message = "O aluno está de recuperação, sua média foi de: " + mediaString;
                } else {
                    message = "O aluno foi aprovado, sua média foi de: " + mediaString;
                }

                Snackbar snackbar = Snackbar.make(rootlayout, message, duration);
                snackbar.show();
            }
        });

        return view;
    }
}
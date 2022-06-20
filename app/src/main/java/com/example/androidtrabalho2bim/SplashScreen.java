package com.example.androidtrabalho2bim;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    //Timer Splash
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            //Exibindo a Splash com timer
            @Override
            public void run() {
                //Iniciar nova acitvity
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);

                //fechar esta activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
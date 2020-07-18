package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Bundle extras = getIntent().getExtras();

        Intent intent = getIntent();
        String atleta = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        TextView Atleta = findViewById(R.id.idAtleta);
        Atleta.setText(atleta);


        String esporte = null;
        TextView esp = findViewById(R.id.idEsportes);
        esporte = extras.getString(MainActivity.EXTRA_MESSAGE2);
        String espA = String.format(esporte);
        esp.setText(espA);


        String medalha = null;
        TextView tamanho = findViewById(R.id.idMedalha);
        medalha = extras.getString(MainActivity.EXTRA_MESSAGE3);
        String medA = String.format(medalha);
        tamanho.setText(medA);
    }


}
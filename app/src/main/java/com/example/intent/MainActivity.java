package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE1 = "com.example.imc.MESSAGE1";
    public final static String EXTRA_MESSAGE2 = "com.example.imc.MESSAGE2";
    public final static String EXTRA_MESSAGE3 = "com.example.imc.MESSAGE3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void cadastro(View view) {
        EditText atleta = findViewById(R.id.editatleta);
        RadioButton ginastica = findViewById(R.id.rdoginas);
        RadioButton salto = findViewById(R.id.rdosalto);
        RadioButton futebol = findViewById(R.id.rdofut);
        RadioButton basquete = findViewById(R.id.rdobasq);
        RadioButton tenis = findViewById(R.id.rdoten);
        RadioButton nado = findViewById(R.id.rdonado);
        RadioButton patinacao = findViewById(R.id.rdopat);
        Switch medalha = findViewById(R.id.swmed);
        String med, esp;

        String atlet = atleta.getText().toString();

        if (ginastica.isChecked()) {
            esp = "Ginástica Olimpica";
        } else if (salto.isChecked()) {
            esp = "Salto com Vara";
        } else if (futebol.isChecked()) {
            esp = "Futebol";
        } else if (basquete.isChecked()) {
            esp = "Basquete";
        } else if (tenis.isChecked()) {
            esp = "Tenis";
        } else if (nado.isChecked()) {
            esp = "Nado sincronizado";
        } else if (patinacao.isChecked()) {
            esp = "Patinação Artistica";
        } else {
            esp = "Nenhuma opção selecionada";
        }


        if (medalha.isChecked()) {
            med = "O atleta possui medalha.";
        } else {
            med = "O atleta não ganhou medalha";
        }

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_MESSAGE1, esp);
        intent.putExtra(EXTRA_MESSAGE2, med);
        intent.putExtra(EXTRA_MESSAGE3, atlet);
        startActivity(intent);

    }
}

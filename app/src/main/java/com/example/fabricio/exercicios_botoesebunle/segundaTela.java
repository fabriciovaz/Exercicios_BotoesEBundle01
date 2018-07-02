package com.example.fabricio.exercicios_botoesebunle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class segundaTela extends AppCompatActivity {
 TextView meuTextoimportado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        meuTextoimportado = (TextView) findViewById(R.id.textView01);
        Intent outroIntent = getIntent();
        Bundle outroBundle = outroIntent.getExtras();
        meuTextoimportado.setText(outroBundle.getString("MinhaChave"));
    }
}

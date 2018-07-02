package com.example.fabricio.exercicios_botoesebunle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity_botoes_bundle extends AppCompatActivity {

    private EditText escrevaSeuTexto;
    private Button mudaActivity;
    String valorTransportado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_botoes_bundle);

        mudaActivity = (Button) findViewById(R.id.button01);
        escrevaSeuTexto = (EditText) findViewById(R.id.editText01);
    }

    public void botaopressionado(android.view.View v){
    android.widget.Toast.makeText(this,escrevaSeuTexto.getText().toString(),android.widget.Toast.LENGTH_SHORT).show();
    android.content.Intent intent1 = new android.content.Intent(this, segundaTela.class);
    valorTransportado = escrevaSeuTexto.getText().toString();
        Bundle meuBundle = new Bundle();
        meuBundle.putString("MinhaChave", valorTransportado);
       intent1.putExtras(meuBundle);
        startActivity(intent1);
    }
}


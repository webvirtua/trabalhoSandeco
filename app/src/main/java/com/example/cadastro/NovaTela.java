package com.example.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NovaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tela);

        Intent getIntent = getIntent();

        String nome = getIntent.getStringExtra("nome");
        String data = getIntent.getStringExtra("data");
        String email = getIntent.getStringExtra("email");
        String telefone = getIntent.getStringExtra("telefone");
        String endereco = getIntent.getStringExtra("endereco");
        String mae = getIntent.getStringExtra("mae");
        String pai = getIntent.getStringExtra("pai");
        String civil = getIntent.getStringExtra("civil");
        String profissao = getIntent.getStringExtra("profissao");
        String social = getIntent.getStringExtra("social");
    }
}

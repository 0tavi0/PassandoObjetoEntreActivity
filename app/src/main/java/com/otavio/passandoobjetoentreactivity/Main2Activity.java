package com.otavio.passandoobjetoentreactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView nome = (TextView) findViewById(R.id.nome);
        TextView idade = (TextView) findViewById(R.id.idade);



        Bundle bundle = getIntent().getExtras();
        String serial = (String) bundle.get("chave");

        final Pessoa pessoa = new Gson().fromJson(serial, Pessoa.class);

        nome.setText(""+pessoa.getNome());
        idade.setText(""+pessoa.getIdade());





        Log.e("Nome:","" + pessoa.nome);
        Log.e("Idade:","" + pessoa.idade);


    }
}

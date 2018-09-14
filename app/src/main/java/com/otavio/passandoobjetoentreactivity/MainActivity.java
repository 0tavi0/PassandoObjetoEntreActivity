package com.otavio.passandoobjetoentreactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pessoa p = new Pessoa();

                p.nome = "Otávio";
                p.idade = 28;


                Gson gson = new Gson();
                String s = gson.toJson(p);
                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                intent.putExtra("chave", s);
                startActivity(intent);



            }
        });
    }
}

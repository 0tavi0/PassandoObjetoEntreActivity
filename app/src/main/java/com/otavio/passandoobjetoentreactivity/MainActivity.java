package com.otavio.passandoobjetoentreactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ArrayList<Pessoa> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);

        list = new ArrayList<>();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pessoa p = new Pessoa();

                p.nome = "Otávio";
                p.idade = 28;

                Pessoa p1 = new Pessoa();

                p1.nome = "Camila";
                p1.idade = 23;

                list.add(p);
                list.add(p1);

//      --------------- Passando objeto completo----------------
//                Gson gson = new Gson();
//                String s = gson.toJson(p);
//                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
//                intent.putExtra("chave", s);
//                startActivity(intent);
//      ---------------------------------------------------------

                //passar lista

                Bundle extras = new Bundle();
                extras.putSerializable("lista", list);

                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                intent.putExtra("extra", extras);
                startActivity(intent    );

                Log.e("clicado","+");



            }
        });
    }
}

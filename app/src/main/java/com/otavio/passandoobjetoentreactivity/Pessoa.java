package com.otavio.passandoobjetoentreactivity;

import java.io.Serializable;

public class Pessoa implements Serializable {

    String nome;
    int idade;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

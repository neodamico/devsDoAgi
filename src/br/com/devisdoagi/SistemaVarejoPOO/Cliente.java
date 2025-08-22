package br.com.devisdoagi.SistemaVarejoPOO;

public class Cliente {
    private String nome;
    private String email;

    public Cliente (String nome, String email){
        this.email=email;
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}

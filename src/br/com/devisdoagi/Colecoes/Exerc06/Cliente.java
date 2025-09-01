package br.com.devisdoagi.Colecoes.Exerc06;

public class Cliente {
    String nome;
    double saldo;

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

   @Override
    public String toString(){
        return nome + " R$ " +saldo;
   }
}

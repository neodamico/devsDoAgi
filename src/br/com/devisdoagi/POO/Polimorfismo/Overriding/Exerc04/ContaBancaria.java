package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc04;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    protected ContaBancaria (String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    protected void gerarRelatorio (){
        System.out.println("Relatório Genérico");

    }
}

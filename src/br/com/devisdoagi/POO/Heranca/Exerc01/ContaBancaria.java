package br.com.devisdoagi.POO.Heranca.Exerc01;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;


    //construtor

    public ContaBancaria(String titular, String numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
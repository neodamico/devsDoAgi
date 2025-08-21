package br.com.devisdoagi.POO.ClassesAbstratas.Exerc01;

/*
1. Conta Bancária (Taxa x Rendimento)
Crie a classe abstrata Conta com atributos numero e saldo e o metodo abstrato void atualizarMensal().

Crie as subclasses:
ContaCorrente → desconta R$ 15,00 de taxa mensal.
ContaPoupanca → aumenta o saldo em 0,5%.

No Main, crie uma conta corrente e uma poupança, faça depósito inicial e aplique a atualização mensal.
 */

public abstract class Conta {
    protected String numero;
    protected double saldo;

    public Conta (String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void atualizarMensal();



}

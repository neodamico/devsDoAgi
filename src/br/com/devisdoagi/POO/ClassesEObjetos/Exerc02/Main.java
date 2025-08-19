package br.com.devisdoagi.POO.ClassesEObjetos.Exerc02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaBancaria();
        ContaBancaria contaCorrente2 = new ContaBancaria();

        contaCorrente.titular = "Nelson Damico Junior";
        contaCorrente2.titular = "Erick Guilherme";

        contaCorrente.numeroConta = "001";
        contaCorrente2.numeroConta = "002";

        contaCorrente.saldo = 1000.00;
        contaCorrente2.saldo = 725.00;

        contaCorrente.depositar(500);
        contaCorrente.exibirSaldo();

        System.out.println();

        contaCorrente2.sacar(726);
        contaCorrente2.exibirSaldo();


    }
}

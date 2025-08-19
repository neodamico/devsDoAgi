package br.com.devisdoagi.POO.Encapsulamento.Exerc01;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        cb.setTitular("Nelson Damico Junior");
        cb.setNumeroConta("14558");

        cb.depositar(3000);
        cb.sacar(350);

        cb.exibirExtrato();

    }
}

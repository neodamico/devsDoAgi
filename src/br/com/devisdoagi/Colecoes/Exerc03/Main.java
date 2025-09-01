package br.com.devisdoagi.Colecoes.Exerc03;

import java.util.HashMap;
import java.util.Map;


public class Main {

    static void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoInicial) {
        contas.put(numeroConta, saldoInicial);
    }
    static void depositar(Map<String, Double> contas, String numeroConta, double deposito) {
        contas.put(numeroConta, contas.getOrDefault(numeroConta, 0.0) + deposito);
    }

    static void exibirSaldos(Map <String, Double> contas){
        contas.forEach((conta, saldo)-> System.out.println("Conta" +conta+ " Saldo: R$" +saldo));
    }

    public static void main(String[] args) {
        HashMap<String, Double> contas = new HashMap<>();

        adicionarCliente(contas, "111", 1000);
        adicionarCliente(contas,"222",22000);
        System.out.println();
        depositar(contas, "111", 500);
        depositar(contas, "222", 300);
        depositar(contas,"333",5000);
        System.out.println();
        exibirSaldos(contas);

    }

}

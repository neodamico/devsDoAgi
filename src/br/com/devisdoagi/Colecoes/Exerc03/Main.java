package br.com.devisdoagi.Colecoes.Exerc03;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldo) {
        contas.put(numeroConta, saldo);
    }

    static void depositar(Map<String, Double> contas, String numeroConta, double deposito) {
        if (contas.containsKey(numeroConta)) {
            double saldo = contas.get(numeroConta);
            contas.put(numeroConta, saldo + deposito);
        }else {
            System.out.println("Conta " +numeroConta+ " não encontrada");
        }

    }

    static void exibirSaldos(Map<String, Double> contas) {
        contas.forEach((conta, saldo) -> System.out.println("Conta " + conta + " - Saldo: R$ " + saldo));
    }

    public static void main(String[] args) {
        Map<String, Double> contas = new HashMap<>();

        adicionarCliente(contas, "101",1000);
        adicionarCliente(contas,"202",2000);

        depositar(contas,"101",500);
        System.out.println();
        depositar(contas,"202", 800);
        System.out.println();
        depositar(contas, "303",100);
        System.out.println();

        exibirSaldos(contas);


    }
}

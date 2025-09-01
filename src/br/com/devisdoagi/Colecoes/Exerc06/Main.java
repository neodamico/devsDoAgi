package br.com.devisdoagi.Colecoes.Exerc06;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void adicionarCliente(List<Cliente> clientes, String nome, double saldo) {
        clientes.add(new Cliente(nome, saldo));
    }

    static void ordenarPorSaldo(List<Cliente> clientes) {
        clientes.sort((c1, c2) -> Double.compare(c2.saldo, c1.saldo));
    }

    static void exibirClientes(List<Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        adicionarCliente(clientes, "Nelson", 1000);
        adicionarCliente(clientes, "Malu", 5000);
        adicionarCliente(clientes, "Guga", 3000);
        adicionarCliente(clientes, "Isabel", 700);
        System.out.println();

        ordenarPorSaldo(clientes);
        System.out.println();

        exibirClientes(clientes);

    }


}

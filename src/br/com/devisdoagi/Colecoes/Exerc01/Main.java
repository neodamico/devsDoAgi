package br.com.devisdoagi.Colecoes.Exerc01;

import java.util.HashSet;
import java.util.Set;

public class Main {

    static void adicionarConta(Set<Integer> contas, int numeroConta) {
        if (contas.add(numeroConta)) {
            System.out.println("Conta " + numeroConta + " adicionada");
        } else {
            System.out.println("Conta não adicionada (duplicada) ");
        }

    }

    static boolean existeConta(Set<Integer> contas, int numeroConta) {
        return contas.contains(numeroConta);
    }

    static void exibirContas(Set<Integer> contas) {
        System.out.println("Contas Cadastradas" + contas);
    }

    public static void main(String[] args) {
        HashSet<Integer> contas = new HashSet<>();

        adicionarConta(contas, 101);
        adicionarConta(contas, 102);
        adicionarConta(contas, 103);
        adicionarConta(contas, 102);

        System.out.println("ja existe a conta 101?" +existeConta(contas,101));
        System.out.println("ja existe a conta 104?" +existeConta(contas,104));

        exibirContas(contas);


    }

}

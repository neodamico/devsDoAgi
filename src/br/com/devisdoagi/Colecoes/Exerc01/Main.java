package br.com.devisdoagi.Colecoes.Exerc01;

import java.util.HashSet;
import java.util.Set;

public class Main {

    static void adicionarConta (Set<Integer>contas, int numeroConta){
        contas.add(numeroConta);
    }

    static boolean existeConta (Set<Integer>contas, int numeroConta){
        return contas.contains(numeroConta);

    }

    static void exibirContas (Set<Integer>contas){
        System.out.println("Contas cadastradas: " +contas);
    }

    public static void main(String[] args) {
        HashSet<Integer>contas = new HashSet<>();

        adicionarConta(contas,111);
        adicionarConta(contas,222);
        adicionarConta(contas,333);

        System.out.println();

        System.out.println("Existe a conta 222? " +existeConta(contas,222));
        System.out.println("Existe a conta 444? " +existeConta(contas,444));

        System.out.println();

        exibirContas(contas);

    }



}

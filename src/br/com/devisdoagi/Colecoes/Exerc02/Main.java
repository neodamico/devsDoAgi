package br.com.devisdoagi.Colecoes.Exerc02;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void adicionarProduto(Set<String> produtos, String nomeProduto) {
        if (produtos.add(nomeProduto)) {
            System.out.println("Produto " + nomeProduto + " contratado");
        } else {
            System.out.println("Produto " + nomeProduto + " Já contratado");
        }
    }

    static void exibirProdutos(Set<String> produtos) {
        System.out.println("Produtos contratados: " + produtos);
    }

    public static void main(String[] args) {
        HashSet<String> produtos = new HashSet<>();

        adicionarProduto(produtos, "CDB");
        adicionarProduto(produtos,"Limite");
        adicionarProduto(produtos,"Limite");

        System.out.println();

        System.out.println(produtos);




    }
}

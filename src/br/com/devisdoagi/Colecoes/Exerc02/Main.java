package br.com.devisdoagi.Colecoes.Exerc02;

import java.util.HashSet;
import java.util.Set;

public class Main {

    static void adicionarProduto(Set<String> produtos, String nomeProduto){
        if(produtos.add(nomeProduto)){
            System.out.println("Produto " +nomeProduto+ " adquirido com sucesso");

        }else {
            System.out.println("Produto " +nomeProduto+ " Já adiquirido anteriormente");
        }

    }

    static void exibirProdutos (Set<String> produtos){
        System.out.println("Produtos contratados: " +produtos);
    }

    public static void main(String[] args) {
        HashSet<String>produtos = new HashSet<>();

        System.out.println("----------------------------------------------------");
        adicionarProduto(produtos, "CDB");
        adicionarProduto(produtos, "Previdencia");
        adicionarProduto(produtos, "CDB");
        System.out.println("----------------------------------------------------");

        exibirProdutos(produtos);
    }
}

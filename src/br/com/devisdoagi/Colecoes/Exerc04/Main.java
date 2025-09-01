package br.com.devisdoagi.Colecoes.Exerc04;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static void adicionarProduto (Map<String, Integer> produto, String nomeProduto, int estoque){
        produto.put(nomeProduto, estoque);
    }

    static void adicionarEstoque(Map<String, Integer> produto, String nomeProduto, int adicionar) {
        produto.put(nomeProduto, produto.getOrDefault(nomeProduto, 0) + adicionar);
    }

    static void removerEstoque (Map<String, Integer> produto, String nomeProduto, int remover){
        produto.put(nomeProduto, produto.getOrDefault(nomeProduto,0) - remover);
    }

    static void exibirEstoque(Map<String, Integer> produto){
        produto.forEach((produtos, qtd)-> System.out.println("Produto: " +produtos+ " Estoque " +qtd));
    }

    public static void main(String[] args) {
        HashMap<String, Integer> produto = new HashMap<>();

        adicionarProduto(produto,"Feijão",150);
        adicionarProduto(produto, "Arroz", 200);
        System.out.println();
        adicionarEstoque(produto,"Feijão",30);
        removerEstoque(produto,"Arroz",20);
        System.out.println();
        exibirEstoque(produto);




    }
}

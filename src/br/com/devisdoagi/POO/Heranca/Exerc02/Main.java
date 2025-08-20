package br.com.devisdoagi.POO.Heranca.Exerc02;

public class Main {

    public static void main(String[] args) {
        ProdutoPerecivel item = new ProdutoPerecivel("012", "Danone", 5.99, "2025-08-10");

        item.estaVencido("2025-08-19");

        System.out.println("Produto: "  +item.getNome());
        System.out.println("Vencido em 2025-08-19? " + item.estaVencido("2025-08-19"));
    }
}
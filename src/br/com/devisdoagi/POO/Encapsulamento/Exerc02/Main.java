package br.com.devisdoagi.POO.Encapsulamento.Exerc02;

public class Main {
    public static void main(String[] args) {
        Produto prod = new Produto();

        prod.setNome("Danone");
        prod.setPreco(7.99);

        prod.adicionarEstoque(135);
        prod.removerEstoque(80);

        prod.exibirProduto();
    }
}

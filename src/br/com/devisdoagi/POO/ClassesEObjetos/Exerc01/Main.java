package br.com.devisdoagi.POO.ClassesEObjetos.Exerc01;

public class Main {
    public static void main(String[] args) {
        Produtos meuProduto = new Produtos();
        Produtos meuProduto2 = new Produtos();

        meuProduto.nome = "Televisão";
        meuProduto.preco = 1100.00;
        meuProduto.quantidade = 10;

        meuProduto2.nome = "Video Game";
        meuProduto2.preco = 575.00;
        meuProduto2.quantidade = 8;

        meuProduto.adicionarEstoque( 6);
        meuProduto2.removerEstoque(3);

        meuProduto.exibirDados();
        System.out.println();
        meuProduto2.exibirDados();
    }
}

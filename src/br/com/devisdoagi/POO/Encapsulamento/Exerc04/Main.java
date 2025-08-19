package br.com.devisdoagi.POO.Encapsulamento.Exerc04;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompra compra = new CarrinhoCompra();

        compra.setProduto("Requeijão");
        compra.setQuantidade(10);
        compra.setPrecoUnitario(2.50);


        compra.calcularSubtotal();

        compra.exibirNota();
    }
}

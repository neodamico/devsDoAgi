package br.com.devisdoagi.POO.Encapsulamento.Exerc04;

public class CarrinhoCompra {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 1) {
            System.out.println("Quantidade tem que ser maior que um");
        } else {
            this.quantidade = quantidade;
        }

    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario <= 0) {
            System.out.println("Preço unitario deve ser positivo.");
        } else {
            this.precoUnitario = precoUnitario;
        }

    }

    public double calcularSubtotal(){
        return this.quantidade * this.precoUnitario;

    }

    public void exibirNota(){
        System.out.println("Produto: " +getProduto());
        System.out.println("Preço Unitário: " +getPrecoUnitario());
        System.out.println("Quantidade: " +getQuantidade());
        System.out.println("Total: " +calcularSubtotal());
    }
}

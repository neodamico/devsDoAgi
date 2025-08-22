package br.com.devisdoagi.SistemaVarejoPOO;

abstract class Produto implements OperacoesProduto {
    private int codigo;
    private String nomeProduto;
    private double preco;
    private String clienteComprador;

    public Produto(int codigo, String nomeProduto, double preco, String clienteComprador) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.clienteComprador = clienteComprador;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        setPreco(getPreco() - getPreco() * (percentual / 100.0));
    }

    @Override
    public void aumentarPreco(double percentual) {
        setPreco(getPreco() + getPreco() * (percentual / 100.0));
    }

    public abstract double calcularFrete();


    public String getNomeProduto() {
        return nomeProduto;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}

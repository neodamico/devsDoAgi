package br.com.devisdoagi.SistemaVarejoPOO;

public class ProdutoDigital extends Produto{

    public ProdutoDigital(int codigo, String nomeProduto, double preco, String clienteComprador) {
        super(codigo, nomeProduto, preco, clienteComprador);
    }

    @Override
    public double calcularFrete(){
        return 0.00;
    }
}

package br.com.devisdoagi.SistemaVarejoPOO;

public class ProdutoFisico extends Produto{


    public ProdutoFisico(int codigo, String nomeProduto, double preco, String clienteComprador) {
        super(codigo, nomeProduto, preco, clienteComprador);
    }

    @Override
    public double calcularFrete(){
        return 20.00;
    }
}

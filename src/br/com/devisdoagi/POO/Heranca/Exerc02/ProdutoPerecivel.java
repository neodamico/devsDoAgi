package br.com.devisdoagi.POO.Heranca.Exerc02;

public class ProdutoPerecivel extends Produto {
    public String dataValidade;
    public ProdutoPerecivel(String codigo, String nome, double preco, String dataValidade){
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(String dataAtual){
        return dataValidade.compareTo(dataAtual) < 0;
    }

    public String getDataValidade(){
        return dataValidade;
    }
}

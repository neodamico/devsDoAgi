package br.com.devisdoagi.POO.Interface.Exerc02;

public class ProdutoComum implements Idescontavel{
    public double calcularPrecoFinal (double precoBase){
        return precoBase - (precoBase * 0.05);
    }
}

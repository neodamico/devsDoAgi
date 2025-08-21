package br.com.devisdoagi.POO.Interface.Exerc02;

public class MainProduto {
    public static void main(String[] args) {
        Idescontavel prod = new ProdutoComum();
        Idescontavel prod2 = new ProdutoPromocional();

        double precoBase = 100;
        System.out.println("Produto comum: R$ " +prod.calcularPrecoFinal(precoBase));
        System.out.println("Produto Promocional: R$ " +prod2.calcularPrecoFinal(precoBase));


    }

}

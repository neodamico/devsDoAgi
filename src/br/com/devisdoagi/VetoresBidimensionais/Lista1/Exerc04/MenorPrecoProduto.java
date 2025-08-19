package br.com.devisdoagi.VetoresBidimensionais.Lista1.Exerc04;

/*  Dada uma matriz 2x3 com preços de produtos em 2 lojas,
crie um método para encontrar o menor preço de cada produto (mínimo por coluna).
double[] encontrarMenorPrecoPorProduto(double[][] matriz);
*/
public class MenorPrecoProduto {

    public static double[] encontrarMenorPrecoPorProduto(double [][] matriz) {
        double[]menorPreco = new double[matriz[0].length];
        for (int p  = 0; p < matriz[0].length ; p++) {
            double menor = matriz[0][p];
            for (int l = 0; l < matriz.length ; l++) {
                if(matriz[l][p]< menor){
                    menor = matriz[l][p];
                }

            }
            menorPreco[p] = menor;
        }
        return menorPreco;
    }

    public static void main(String[] args) {
        double [][] matriz = {
                {100, 152, 135},
                {101, 154, 123}
        };
    }

}

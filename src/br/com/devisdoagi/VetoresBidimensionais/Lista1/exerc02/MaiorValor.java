package br.com.devisdoagi.VetoresBidimensionais.Lista1.exerc02;

/*2. Dada uma matriz 3x4 que representa dívidas mensais de 3 clientes em 4 meses,
 crie um método para encontrar o maior valor da matriz.

        double encontrarMaiorValor(double[][] matriz);
*/
public class MaiorValor {

    public static double encontreMaiorValor(double [][] matriz){
        double maior = matriz [0][0];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        double[][] matriz = {
                {5000, 7000, 6500, 8000},
                {3000, 4500, 4000, 4200},
                {2000, 2100, 2200, 2500}
        };
        System.out.println("O maior valor é: " +encontreMaiorValor(matriz));

    }
}

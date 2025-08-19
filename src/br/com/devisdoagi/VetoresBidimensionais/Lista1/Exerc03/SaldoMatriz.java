package br.com.devisdoagi.VetoresBidimensionais.Lista1.Exerc03;

/*3. Crie um método que calcule o total de saldos de uma matriz 3x2 (clientes x meses)
e outro método que calcule o saldo médio por cliente (média das linhas).
double calcularSaldoTotal(double[][] matriz);
double[] calcularMediaPorCliente(double[][] matriz);
*/

public class SaldoMatriz {

    public static double calcularSaldoTotal(double[][] matriz){
        double calcular =0;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                calcular += matriz[i][j];

            }
        }
        return calcular;
    }

    public static double[] calcularMediaPorCliente (double [][]matriz){
        double[] media = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            double soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma = soma + matriz[i][j];
            }
            media[i] = soma / matriz[i].length;
        }
        return media;
    }

    public static void main(String[] args) {
        double[][] matriz = {
                {1000, 1500},
                {2000, 2500},
                {3000, 3500}
        };
        System.out.println("Saldo Total = " +calcularSaldoTotal(matriz));
        double[]medias = calcularMediaPorCliente(matriz);
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Média cliente %d: %.2f%n", i +1, medias[i]);
        }
    }
}

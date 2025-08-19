package br.com.devisdoagi.VetoresBidimensionais.Lista1.Exerc01;

import java.util.Arrays;

public class Main {

    public static void preencherMatriz(double [][] matriz){
        matriz[0][0] = 1000; //receita mes 1
        matriz[0][1] = 800; // despesa mes 1
        matriz[1][0] = 1200; // receita mes 2
        matriz[1][1] = 900; // despesa mes 2
    }

    public static double calcularSomaTotal (double[][] matriz){
        double soma = 0;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma = soma + matriz[i][j];
            }
        }
        return soma;

    }


    public static void main(String[] args) {
        double[][] matriz = new double[2][2];
        preencherMatriz(matriz);
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("Total da soma da matriz: " +calcularSomaTotal(matriz));

    }
}

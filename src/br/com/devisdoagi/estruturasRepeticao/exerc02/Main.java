package br.com.devisdoagi.estruturasRepeticao.exerc02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo N: ");
        int N = entrada.nextInt();
        int soma = 0;
        int impar = 1;

        for (int i = 0; i < N; i++) {
            soma = soma + impar;
            impar = impar + 2;

        }
        System.out.println("Quadrado de " + N + " é: " + soma);


    }
}

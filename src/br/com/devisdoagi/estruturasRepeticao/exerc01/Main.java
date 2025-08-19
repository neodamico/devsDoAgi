package br.com.devisdoagi.estruturasRepeticao.exerc01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o número que deseja a tabuada: ");
        int numero = entrada.nextInt();

        System.out.println("A tabuada do número " + numero + " é: ");
        for (int i = 1; i <= 10; i++) {
            int result = numero * i;
            System.out.println(numero + "X" + i + " = " + result);
        }
    }
}

package br.com.devisdoagi.estruturasRepeticao.exerc05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero a receber a sequencia fibonacci: ");
        int maximo = entrada.nextInt();

        int a = 0;
        int b = 1;

        while (a <= maximo){
            System.out.printf(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;
        }

    }

}

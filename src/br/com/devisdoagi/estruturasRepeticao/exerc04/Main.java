package br.com.devisdoagi.estruturasRepeticao.exerc04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero a ser fatorado: ");
        int numero = entrada.nextInt();
        int fatoracao = 1;

        for (int i = numero ; i > 1; i--) {
            fatoracao = fatoracao * i;


        }
        System.out.println(fatoracao);


    }
}

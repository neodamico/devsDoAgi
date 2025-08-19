package br.com.devisdoagi.estruturasCondicionais.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite um número inteiro: ");
        int numeroInteiro = entrada.nextInt();

        if(numeroInteiro % 2 == 0){
            System.out.printf("Seu número é par");
        }else{
            System.out.printf("Seu número é impar");
        }
    }
}

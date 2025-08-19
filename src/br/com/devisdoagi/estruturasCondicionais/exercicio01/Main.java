package br.com.devisdoagi.estruturasCondicionais.exercicio01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite um numero inteiro: ");
        int numeroInteiro = entrada.nextInt();

        if(numeroInteiro > 0){
            System.out.printf("Seu número é positivo");
        } else if (numeroInteiro < 0) {
            System.out.printf("Seu número é negativo");
        }else {
            System.out.printf("Seu número é zero");
        }
    }
}

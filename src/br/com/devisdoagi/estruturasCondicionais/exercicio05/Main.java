package br.com.devisdoagi.estruturasCondicionais.exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite sua nota final: ");
        double notaFinal = entrada.nextDouble();

        if(notaFinal >= 6){
            System.out.printf("Você está aprovado.");
        } else if (notaFinal >= 4 && notaFinal < 6) {
            System.out.printf("Você esta de recuperação");
        }else {
            System.out.printf("Você está reprovado");
        }

    }
}

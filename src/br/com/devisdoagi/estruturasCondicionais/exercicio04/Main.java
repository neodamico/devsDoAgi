package br.com.devisdoagi.estruturasCondicionais.exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o Valor da Média: ");
        double media = entrada.nextDouble();

        System.out.printf("Digite o valor da nota: ");
        double nota = entrada.nextDouble();

        double diferenca = Math.abs(nota - media);
        double difPercent = (diferenca/media)*100;

        System.out.printf("A nota se aproxima da média em %.2f%% ", difPercent);
    }
}

package br.com.devisdoagi.estruturasCondicionais.exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o tipo de investimento a ser realizado: ");
        System.out.println("1- CDB");
        System.out.println("2- CDI");
        System.out.println("3- Tesouro Direto");
        System.out.println("4- FII");
        int opcao = entrada.nextInt();
        switch (opcao){
            case 1 -> {
                System.out.println("Você escolheu CDB");
                break;
            }
            case 2 -> {
                System.out.println("Você escolheu CDI");
                break;
            }
            case 3 -> {
                System.out.println("Você escolheu Tesouro Direto");
                break;
            }
            case 4 -> {
                System.out.println("Você escolheu FII");
                break;
            }
            default -> System.out.println("Opção inválida.");
        }

    }
}

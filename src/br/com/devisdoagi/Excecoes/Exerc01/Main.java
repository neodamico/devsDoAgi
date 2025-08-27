package br.com.devisdoagi.Excecoes.Exerc01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] saldo = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o índice da conta: ");
            int indice = sc.nextInt();
            System.out.println("Saldo da conta R$" + saldo[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido");
        }


    }
}

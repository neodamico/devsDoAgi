package br.com.devisdoagi.estruturasRepeticao.exerc03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero X: ");
        int X = entrada.nextInt();

        System.out.println("Digite o numero Y: ");
        int Y = entrada.nextInt();

        int result = 1;

        for (int i = 1; i <= Y; i++) {
            result = result * X;

        }

        System.out.println(result);

    }
}

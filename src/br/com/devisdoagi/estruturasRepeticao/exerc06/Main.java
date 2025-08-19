package br.com.devisdoagi.estruturasRepeticao.exerc06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = entrada.nextDouble();
        double desconto = 0.0;

        if (valorCompra > 300 && valorCompra <= 500) {
            desconto = 0.05;
        } else if (valorCompra > 500 && valorCompra <= 1000) {
            desconto = 0.10;
        } else if (valorCompra > 1000) {
            desconto = 0.12;
        }

        double valorDesconto = valorCompra * desconto;
        double total = valorCompra - valorDesconto;
        double conversaoDesconto = desconto * 100;

        System.out.printf("Valor da compra: %.2f \n", valorCompra);
        System.out.printf("Desconto aplicado: %.0f%% \n", conversaoDesconto);
        System.out.printf("Valor do desconto: %.2f\n", valorDesconto);
        System.out.println("----------------------------------------------");
        System.out.printf("Total: %.2f", total);

    }
}

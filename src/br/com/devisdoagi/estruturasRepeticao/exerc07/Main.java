package br.com.devisdoagi.estruturasRepeticao.exerc07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        double total = 0.0;
        double gasto;


        while (true) {
            System.out.println("Digite o valor do seu gasto: ");
            gasto = entrada.nextDouble();

            if (gasto < 0) {
                break;
            }

            total = total + gasto;
        }

        System.out.printf("\nTotal de gastos: R$ %.2f\n", total);

        if (total > 5000) {
            System.out.println("Alerta: Seus gastos ultrapassaram 5000");
        } else {
            System.out.println("Gastos dentro do limite.");
        }
    }
}


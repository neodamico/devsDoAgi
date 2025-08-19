package br.com.devisdoagi.estruturasRepeticao.exerc08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da sua dívida: ");
        double dividaTotal = entrada.nextDouble();
        int mes = 1;

        while (dividaTotal > 0) {
            System.out.printf("\nMês %d:  Saldo restante: R$ %.2f", mes, dividaTotal);

            System.out.printf("\n Digite o valor do pagamento do mês %d: \n", mes);
            double pgMensal = entrada.nextDouble();
            dividaTotal = dividaTotal - pgMensal;

            if (dividaTotal <= 0) {
                dividaTotal = 0;
                System.out.println("Divida quitada");
                break;
            }

            mes++;

        }
    }
}

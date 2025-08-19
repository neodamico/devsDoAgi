package br.com.devisdoagi.estruturasRepeticao.exerc10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);



        double limite = 1000;

        while (limite > 0) {
            System.out.println("\n Digite o valor a converter(BRL): ");
            double reais = entrada.nextDouble();

            if(limite == 0){
                System.out.println("Operação encerrada");
                break;
            }

            if(reais > limite){
                System.out.printf("Limite de conversao indisponivel, você tem %.2f de limite \n", limite);
            }else {
                limite -= reais;
               double conversao = reais/5;
                System.out.printf("você usou R$ %.2f do seu limite. Foi convertido para USD %.2f \n", reais ,conversao);
                System.out.printf("Seu limite atual é de: %.2f\n", limite);

            }

        }


    }
}

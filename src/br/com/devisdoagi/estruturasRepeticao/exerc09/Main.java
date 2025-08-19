package br.com.devisdoagi.estruturasRepeticao.exerc09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu saldo inicial: ");
        double sdInicial = entrada.nextDouble();
        double valorsq ;


        while (sdInicial > 0){
            System.out.print("Digite o valor do saque (0 para sair): ");
            valorsq = entrada.nextDouble();

            if(valorsq == 0){
                System.out.println("Operação encerrada!");
                break;
            }

            if(valorsq > sdInicial){
                System.out.println("Saldo Insuficiente: " +sdInicial);
            }else {
                sdInicial -= valorsq;
                System.out.printf("Saque Realizado! Novo saldo: R$ %.2f\n", sdInicial);
            }



        }
    }
}
package br.com.devisdoagi.estruturasCondicionais.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = entrada.nextDouble();

        double imc = peso / (altura*altura);

        if(imc < 18.5){
            System.out.printf("Seu imc é de %.2f e você está abaixo do peso", imc);
        }else if(imc >= 18.5 && imc <=24.99){
            System.out.printf("Seu imc é de %.2f e você está no peso ideal", imc);
        } else if(imc >= 25 && imc <= 29.99) {
            System.out.printf("Seu imc é de %.2f e você está com sobrepeso", imc);
        }else{
            System.out.printf("Seu imc é de %.2f e Você está com obesidade", imc);
        }
    }
}

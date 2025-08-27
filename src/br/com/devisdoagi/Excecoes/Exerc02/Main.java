package br.com.devisdoagi.Excecoes.Exerc02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quantos preços deseja informar? ");
            int n = Integer.parseInt(sc.nextLine());

            double[] precos = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Digite o preço do dia " + (i + 1) + ": ");
                String entrada = sc.nextLine();
                precos[i] = Double.parseDouble(entrada);

                if (precos.length < 3) {
                    throw new IllegalArgumentException("É necessário pelo menos 3 preços para calcular a média móvel. ");
                }
            }
            for (int i = 2; i < precos.length; i++) {
                double media = (precos[i] + precos[i - 1] + precos[i - 2]) / 3.0;
                System.out.println("Média Móvel (dia " + (i + 1) + "): " + media);

            }


        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor informado não é numérico!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}


package br.com.devisdoagi.estruturasCondicionais.exercicio07;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("De 0 a 5 avalie seu nível de satisfação com o banco: ");
        int nota = entrada.nextInt();
        switch (nota){
            case 0 -> System.out.println();
                case 1 -> System.out.println("Vamos melhorar");
                case 2 -> System.out.println("Agradecemos o retorno");
                case 3 -> System.out.println("Trabalhando para melhorar");
                case 4 -> System.out.println("Felizes pela satisfação");
                case 5 -> System.out.println("UAU!! Obrigado");
            default -> System.out.println("Nota válida de 0 a 5");
        }
    }
}

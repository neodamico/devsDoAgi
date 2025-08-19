package br.com.devisdoagi.hackathon_caixaCidadao;

import java.util.Scanner;

public class CaixaCidadao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.00; // Saldo inicial fixo
        int opcao;

        do {
            System.out.println("\n============================");
            System.out.printf("Saldo atual: R$ %.2f\n", saldo);
            System.out.println("Bem-vindo ao Caixa Cidadão");
            System.out.println("1. Sacar");
            System.out.println("2. Simular pagamento de dívida");
            System.out.println("3. Planejar meta de economia");
            System.out.println("4. Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: implementar saque com validação

                    while (saldo > 0) {
                        System.out.println("==============================================");
                        System.out.println("Digite o valor do saque ou 0 para encerrar: ");
                        double saque = sc.nextDouble();

                        if (saque == 0) {
                            System.out.println("Operação encerrada, obrigado por usar o nosso banco.");
                            break;
                        }
                        if (saque > saldo) {
                            System.out.printf("Saque indisponível. Seu saldo é de: R$ %.2f \n", saldo);
                        } else {
                            saldo -= saque;
                            System.out.printf("Saque no valor de R$ %.2f realizado, seu novo saldo é de: R$ %.2f \n", saque, saldo);
                        }
                    }
                    break;

                case 2:
                    // TODO: simulação de pagamento de dívida com laço
                    System.out.println("===================================================");
                    System.out.println("Digite o valor da sua dívida: ");
                    double divida = sc.nextDouble();
                    int mes = 1;

                    while (divida > 0) {
                        System.out.printf("Mês %d , divida atual %.2f\n", mes, divida);
                        System.out.println("\nDigite o valor do pagamento da dívida ou pressione 0 para sair: ");
                        double pgDivida = sc.nextDouble();

                        if (pgDivida == 0) {
                            System.out.println("Operação encerrada, agradecemos por utilizar nossos serviços\n");
                            break;
                        }
                        if (pgDivida > divida) {
                            System.out.println("Você está pagando mais que o valor da dívida, por favor corrija o valor a ser pago\n");
                        } else {
                            divida -= pgDivida;
                            mes++;
                        }
                    }
                    System.out.printf("Sua dívida foi quitada em %d mes(es).", mes - 1);


                    break;
                case 3:
                    // TODO: planejamento de meta financeira
                    System.out.println("================================================");
                    System.out.println("Digite qual sua meta a ser alcançada ou pressione 0 para sair: ");
                    double meta = sc.nextDouble();
                    double deposito;
                    double totalDeposito = 0;
                    double meses = 0;


                        System.out.println("Digite o valor que você vai guardar por mês: ");
                        deposito = sc.nextDouble();

                        if (deposito == 0) {
                            System.out.println("Você está pagando mais que o valor da dívida, por favor corrija o valor a ser pago\n");
                        } else {
                            meses = meta / deposito;
                            totalDeposito = (totalDeposito + deposito) * meses;

                        }

                    System.out.printf("Sua meta será atingida em %.0f mes(es).", meses);


                    break;


                case 4:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        sc.close();
    }
}

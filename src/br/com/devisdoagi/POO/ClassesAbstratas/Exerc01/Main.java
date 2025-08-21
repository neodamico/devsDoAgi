package br.com.devisdoagi.POO.ClassesAbstratas.Exerc01;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("99", 250);
        Conta cp = new ContaPoupanca("100", 1000);

        cc.atualizarMensal();
        cp.atualizarMensal();

        System.out.println("Saldo CC: " +cc.getSaldo());
        System.out.printf("Saldo CP: %.2f" , cp.getSaldo());
    }
}

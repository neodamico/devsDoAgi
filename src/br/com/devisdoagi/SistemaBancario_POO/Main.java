package br.com.devisdoagi.SistemaBancario_POO;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente("William Patrick", "452874998-12");
        Conta cc = new ContaCorrente("225",1000, cli.getName());
        Conta cp = new ContaPoupanca("22010",2000, cli.getName());

        System.out.println("Correntista: " +cli.getName()+ " CPF: " +cli.getCpf() + "\n");
        System.out.println("Conta Corrente número: " +cc.getNumeroConta());
        System.out.println("Saldo: " +cc.getSaldo());
        cc.sacar(100);
        System.out.println("Saldo após saque: " +cc.getSaldo());
        cc.depositar(600);
        System.out.println("Saldo após deposito: " +cc.getSaldo());
        cc.aplicarJuros();



        System.out.println("Correntista: " +cli.getName()+ " CPF: " +cli.getCpf());
        System.out.println("Conta Corrente número: " +cp.getNumeroConta());
        System.out.println("Saldo: " +cp.getSaldo());
        cp.sacar(100);
        System.out.println("Saldo após saque: " +cp.getSaldo());
        cp.depositar(600);
        System.out.println("Saldo após deposito: " +cp.getSaldo());
        cp.aplicarJuros();
        System.out.println("Saldo após os rendimentos da Poupança: " +cp.getSaldo());
    }
}

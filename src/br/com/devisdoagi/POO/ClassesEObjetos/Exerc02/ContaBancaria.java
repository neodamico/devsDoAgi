package br.com.devisdoagi.POO.ClassesEObjetos.Exerc02;

public class ContaBancaria {
    public String titular;
    public String numeroConta;

    public double saldo;

    public void depositar (double valor){
        saldo += valor;
    }

    public void sacar (double valor){
        if (valor <= saldo){
            saldo -= valor;
        }else {
            System.out.println("Saque indisponível. Saldo insuficiente.");
        }

    }

    public void exibirSaldo(){
        System.out.println("Titular da conta: " + this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo atualizado: " +this.saldo);
    }
}

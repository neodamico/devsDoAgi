package br.com.devisdoagi.POO.Encapsulamento.Exerc01;

public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
        } else {
            saldo += valor;
        }
        return saldo;
    }

    public double sacar (double valor) {
        if (valor > saldo){
            System.out.println("Saque não autorizado. Saldo indisponível");
        }else{
            saldo -= valor;
        }

        return saldo;
    }

    public void exibirExtrato(){
        System.out.println("Titular: " +this.getTitular());
        System.out.println("Conta corrente: " +this.getNumeroConta());
        System.out.println("Saldo: " +this.saldo);
    }
}

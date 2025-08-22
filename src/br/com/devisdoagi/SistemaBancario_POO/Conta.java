package br.com.devisdoagi.SistemaBancario_POO;

abstract class Conta implements OperacoesBancarias{
    private String numeroConta;
    private double saldo;
    private String clienteTitular;

    public Conta (String numeroConta, double saldo, String clienteTitular){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.clienteTitular = clienteTitular;
    }

    @Override
    public void depositar (double valor){
        saldo += valor;
    }
    @Override
    public void sacar (double valor){
        saldo -= valor;
    }

    public abstract void aplicarJuros();


    public String getNumeroConta() {
        return numeroConta;
    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}

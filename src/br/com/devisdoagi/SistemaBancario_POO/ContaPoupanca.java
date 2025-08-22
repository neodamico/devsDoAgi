package br.com.devisdoagi.SistemaBancario_POO;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(String numeroConta, double saldo, String clienteTitular) {
        super(numeroConta, saldo, clienteTitular);
    }

    @Override
    public void aplicarJuros(){
        setSaldo(getSaldo() * 1.01);
    }
}

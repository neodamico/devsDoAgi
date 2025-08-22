package br.com.devisdoagi.SistemaBancario_POO;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numeroConta, double saldo, String clienteTitular) {
        super(numeroConta, saldo, clienteTitular);
    }

    @Override
    public void aplicarJuros(){
        System.out.println("Conta corrente não tem rendimento. \n");
    }

}

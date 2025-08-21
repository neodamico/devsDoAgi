package br.com.devisdoagi.POO.ClassesAbstratas.Exerc01;

/*
Crie as subclasses:
ContaCorrente → desconta R$ 15,00 de taxa mensal.
ContaPoupanca → aumenta o saldo em 0,5%.
 */

public class ContaPoupanca extends Conta {
    public ContaPoupanca (String numero, double saldo){
        super(numero, saldo);
    }

    @Override
    public void atualizarMensal(){
        setSaldo(getSaldo() * 1.005);

    }
}

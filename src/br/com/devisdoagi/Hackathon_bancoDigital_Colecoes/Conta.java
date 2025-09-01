package br.com.devisdoagi.Hackathon_bancoDigital_Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    private List<Transacao> extrato = new ArrayList<>();

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
    }

    public int getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    // Dicas para os métodos a implementar:
    // - depositar(double valor): adicionar ao saldo, registrar transação
    // - sacar(double valor): verificar saldo, subtrair valor, registrar transação
    // - transferir(double valor, Conta destino): verificar saldo, atualizar saldos, registrar transações em ambas contas
    // - mostrarExtrato(): percorrer lista de transações e imprimir

    public void depositar(double valor){
        if(valor <= 0) throw new IllegalArgumentException("Valor deve ser positivo");
        saldo += valor;
        extrato.add(new Transacao("Deposito",valor,numero,numero));

    }

    public void sacar (double valor){
        if(valor <= 0) throw new IllegalArgumentException("Valor deve ser positivo");
        if(valor > saldo) throw new IllegalArgumentException("Saldo insuficiente");
        saldo -= valor;
        extrato.add(new Transacao("Saque", valor,numero,numero));
    }

    public void transferir(double valor, Conta destino){
        if(valor <= 0) throw new IllegalArgumentException("Valor deve ser positivo");
        if(valor > saldo) throw new IllegalArgumentException("Saldo insuficiente");
        saldo -= valor;
        extrato.add(new Transacao("Tranferencia enviada", valor, numero,destino.numero));
        destino.depositar(valor);
        destino.extrato.add(new Transacao("Transferencia Recebida", valor, numero, destino.numero));

    }

    public void mostrarExtrato(){
        System.out.println("===EXTRATO CONTA" +numero+ "===");
        for (Transacao t : extrato) System.out.println(t);
    }

}

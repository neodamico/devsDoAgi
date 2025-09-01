package br.com.devisdoagi.Colecoes.Exerc05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void registrarTransacao(List<String>historico, String transacao){
        historico.add(transacao);
        System.out.println("Transação efetuada: " +transacao);
    }

    static boolean buscarTransacao(List<String>historico, String transacao){
        return historico.contains(transacao);
    }

    static void exibirHistorico(List<String>historico){
        System.out.println("Historico de transação: " +historico);
    }

    public static void main(String[] args) {
        List<String>historico = new ArrayList<>();

        registrarTransacao(historico,"Deposito");
        registrarTransacao(historico,"Saque");
        registrarTransacao(historico,"Transferencia");
        registrarTransacao(historico,"Saque");
        System.out.println();
        System.out.println("A transação Deposito foi feita?" +buscarTransacao(historico,"Deposito"));
        System.out.println("A transação Pix foi feita?" +buscarTransacao(historico,"Pix"));
        System.out.println();
        exibirHistorico(historico);
    }


}

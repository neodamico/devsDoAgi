package br.com.devisdoagi.POO.Interface.Exerc01;

public class MainPagamento {
    public static void main(String[] args) {
        Ipagamento pgt = new PagamentoBoleto();
        Ipagamento pgt2 = new PagamentoCartao();

        pgt.ProcessarPagamento(500);
        pgt2.ProcessarPagamento(1800);
    }
}

package br.com.devisdoagi.POO.Interface.Exerc01;
/*
Tema: Interface
 Interfaces e Classes: IPagamento, PagamentoBoleto, PagamentoCartao
Enunciado:
 Crie uma interface chamada IPagamento com o seguinte metodo:
public void processarPagamento(double valor);



PagamentoCartao, que imprime:
 "Pagamento de R$valor realizado via cartão de crédito."

Crie uma classe MainPagamento que permita testar ambas as implementações.
 */

public interface Ipagamento {
    public void ProcessarPagamento (double valor);
}

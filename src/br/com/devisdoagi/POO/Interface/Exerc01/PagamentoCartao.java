package br.com.devisdoagi.POO.Interface.Exerc01;
/*

classe PagamentoCartao, que imprime:
 "Pagamento de R$valor realizado via cartão de crédito."
 */

public class PagamentoCartao implements Ipagamento{
    @Override
    public void ProcessarPagamento(double valor){
        System.out.println("Pagamento de R$ " +valor+ " Realizado via cartão de crédito");
    }
}

package br.com.devisdoagi.POO.Interface.Exerc01;
/*
Em seguida, implemente duas classes:
PagamentoBoleto, que imprime:
 "Pagamento de R$valor realizado via boleto bancário."
 */

public class PagamentoBoleto implements Ipagamento {
@Override
    public void ProcessarPagamento(double valor){
    System.out.println("Pagamento de R$ " +valor+ " Realizado via boleto bancario");
}
}

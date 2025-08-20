package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc01;

public class PagamentoCartaoCredito extends Pagamento{
    private String numeroCartao;

    public PagamentoCartaoCredito (double valor, String numeroCartao){
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento (double valor){
        System.out.println("Processando pagamento de R$ " +valor+ " Com numumero do cartão: " +numeroCartao);
    }


}

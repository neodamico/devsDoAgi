package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc01;

public class PagamentoPix extends Pagamento{
    private String chavePix;

    public PagamentoPix ( double valor, String chavePix){
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor){
        System.out.println("Processamento pagamento de R$" + valor + " Via chave pix: " +chavePix);
    }
}

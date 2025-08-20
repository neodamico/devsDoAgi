package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc01;

public class Main {
    public static void main(String[] args) {
        Pagamento pgt1 = new PagamentoCartaoCredito(500,"443454343");
        Pagamento pgt2 = new PagamentoPix(1000, "meuemail@mail");

        pgt1.processarPagamento(500);
        pgt2.processarPagamento(320);
    }
}

package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc01;

public class Pagamento {
    private double valor;

    public Pagamento (double valor){
        this.valor = valor;
    }

    public void processarPagamento(double valor){
        System.out.println("Processando Pagamento genérico de R$" +valor);
    }
}

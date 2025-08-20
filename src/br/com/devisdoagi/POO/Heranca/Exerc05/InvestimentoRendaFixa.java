package br.com.devisdoagi.POO.Heranca.Exerc05;

public class InvestimentoRendaFixa extends Investimento {
    private double taxaAnual;
    private int periodoMeses;

    public InvestimentoRendaFixa (String codigo, double valorInicial, double taxaAnual, int periodoMeses){
        super(codigo, valorInicial);
        this.taxaAnual = taxaAnual;
        this.periodoMeses = periodoMeses;
    }

    public void calcularValorFinal(){
        double valorFinal;
        valorFinal = getValorInicial() * (1 + taxaAnual * (periodoMeses/12));

        System.out.println("Valor final: "+valorFinal);
    }

    public void resumo(){
        System.out.println("Codigo investimento: " +getCodigo());
        System.out.println("Valor Aplicado: " +getValorInicial());
        System.out.println("Taxa de rendimento anual: " +getTaxaAnual());
        System.out.println("Tempo de investimento: " +getPeriodoMeses());
        calcularValorFinal();

    }

    public double getTaxaAnual() {
        return taxaAnual;
    }

    public int getPeriodoMeses() {
        return periodoMeses;
    }
}

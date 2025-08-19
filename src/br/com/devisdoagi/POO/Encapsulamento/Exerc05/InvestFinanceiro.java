package br.com.devisdoagi.POO.Encapsulamento.Exerc05;

public class InvestFinanceiro {
    private String tipoInvestimento;
    private double valorInicial;
    private double taxaAnual;

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        if(valorInicial >= 1000){
            this.valorInicial = valorInicial;
        } else {
            System.out.println("Valor inicial deve ser no mínimo R$ 1000,00");
        }

    }

    public double getTaxaAnual() {
        return taxaAnual;
    }

    public void setTaxaAnual(double taxaAnual) {
        if(taxaAnual >= 1 && taxaAnual <= 20){
            this.taxaAnual = taxaAnual;
        }else{
            System.out.println("A taxa anual deve ser ente 1% e 20%");
        }
    }

    public double calcularValorFuturo (int anos){
        return valorInicial * Math.pow(1 + taxaAnual/100,anos);
    }

    public void exibirResumo(int anos){
        System.out.println("Tipo de investimento: " + getTipoInvestimento());
        System.out.println("Valor Inicial: R$ " +getValorInicial() );
        System.out.println("Taxa Anual: " +getTaxaAnual());
        System.out.printf("Valor final: %.2f", +calcularValorFuturo(anos));
    }
}

package br.com.devisdoagi.POO.Encapsulamento.Exerc05;

public class Main {
    public static void main(String[] args) {
        InvestFinanceiro invest = new InvestFinanceiro();

        invest.setTipoInvestimento("Previdencia Privada");
        invest.setValorInicial(1200);
        invest.setTaxaAnual(15);

        invest.calcularValorFuturo(25);
        invest.exibirResumo(25);
    }
}

package br.com.devisdoagi.Minihackathon2;

public class Main {
    public static void main(String[] args) {

        Investimento[] investimentos = new Investimento[4];
        investimentos[0] = new RendaFixa(1000.0);
        investimentos[1] = new RendaVariavel(1000);
        investimentos[2] = new RendaFixa(1500.0);
        investimentos[3] = new RendaVariavel(3000.0);


        for (Investimento investimento : investimentos) {
            double valorFinal = investimento.calcularRendimento();

            System.out.printf("Investimento: Valor inicial R$%.2f, Valor após rendimento R$%.2f%n", investimento.getValorInicial(), valorFinal);
        }
    }
}//nota 100, PARABENS!!
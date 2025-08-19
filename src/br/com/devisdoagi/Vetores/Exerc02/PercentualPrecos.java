package br.com.devisdoagi.Vetores.Exerc02;


/*      Receba um vetor com os preços diários de uma ação durante 5 dias.
        Use o método variacaoDiaria(double[] precos), que retorne um vetor com as variações percentuais diárias.
        [(valor no momento posterior ÷ valor no momento anterior) - 1] × 100  */

public class PercentualPrecos {

    public static double[] variacaoDiaria(double[] precoDiario) {
        double[] variacao = new double[precoDiario.length - 1];

        for (int i = 1; i < precoDiario.length; i++) {
            variacao[i - 1] = (precoDiario[i] / (precoDiario[i - 1]) - 1) * 100;
        }
        return variacao;

    }

    public static void main(String[] args) {
        double[] precoDiario = {110, 112, 98, 115, 107};
        double[] variacao = variacaoDiaria(precoDiario);

        for (double v : variacao) {
            System.out.printf("%.2f%% ", v);
        }
    }
}

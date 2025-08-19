package br.com.devisdoagi.Vetores.Exerc03;

public class CarteiraAcoes {

    public static double totalInvestido(double[] carteiraAcoes) {
        double total = 0;
        for (double carteira : carteiraAcoes) {
            total += carteira;
        }
        return total;
    }

    public static double[] percentualPorAcao(double[] carteiraAcoes) {
        double total = totalInvestido(carteiraAcoes);
        double[] percent = new double[carteiraAcoes.length];
        for (int i = 0; i < carteiraAcoes.length; i++) {
            percent[i] = (carteiraAcoes[i] / total) * 100;
        }
        return percent;
    }


    public static void main(String[] args) {
        double[] carteiraAcoes = {5000, 3000, 7000, 4000, 6000};
        System.out.println("O total investido em açoes é de: R$ \n" + totalInvestido(carteiraAcoes));
        for(double percentual : percentualPorAcao(carteiraAcoes)){
            System.out.printf(" %.2f%%" ,percentual);
        }

    }
}

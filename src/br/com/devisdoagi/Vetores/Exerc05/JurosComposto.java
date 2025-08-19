package br.com.devisdoagi.Vetores.Exerc05;

import java.util.Arrays;

public class JurosComposto {

    public static double[] calcularJurosCompostos(double valorInicial, double txMensal, int prazo) {
        double[] saldoMensal = new double[prazo];
        double saldo = valorInicial;
        for (int i = 0; i < prazo; i++) {
            saldo = saldo * (1 + txMensal);
            saldoMensal[i] = saldo;
        }
        return saldoMensal;

    }


    public static void main(String[] args) {
        double valorInicial = 1000;
        int prazo = 6;
        double txMensal = 0.02;

        double[] saldos = calcularJurosCompostos(valorInicial, txMensal, prazo);

        String[] saldosFormatados = new String[saldos.length];
        for (int i = 0; i < saldos.length; i++) {
            saldosFormatados[i] = String.format("%.2f", saldos[i]);
        }

        System.out.println(Arrays.toString(saldosFormatados));

    }
}

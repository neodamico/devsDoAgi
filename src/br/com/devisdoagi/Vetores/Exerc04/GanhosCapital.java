package br.com.devisdoagi.Vetores.Exerc04;

import java.util.Arrays;

public class GanhosCapital {

public static double[] lucroPorAtivo(double[] compra, double [] venda){
    double [] lucro = new double [compra.length];
    for (int i = 0; i < compra.length; i++) {
        lucro[i] = venda[i] - compra[i];
    }
    return lucro;
}

public static double lucroTotal(double[]compra, double[]venda){
    double  total = 0;
    for (double luck :lucroPorAtivo(compra, venda)) {
        total += luck;
    }
    return total;
}

public static double calcularImposto(double lucroTotal){
    double imposto;
    if(lucroTotal > 20000){
        imposto = (lucroTotal - 20000) * 0.15;
    }else{
        imposto = 0;
    }
    return imposto;
}

    public static void main(String[] args) {
        double[] compra = {10000, 8000, 12000, 7000, 15000};
        double[] venda = {12000, 8500, 14000, 7200, 18000};
        double lucro = lucroTotal(compra, venda);
        System.out.println("Lucro total: R$" +lucro);
        System.out.println("Imposto devido: R$" +calcularImposto(lucro));
        System.out.println("Lucro por ativo: " + Arrays.toString(lucroPorAtivo(compra, venda)));

    }
}

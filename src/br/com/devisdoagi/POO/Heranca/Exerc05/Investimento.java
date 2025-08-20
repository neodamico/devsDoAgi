package br.com.devisdoagi.POO.Heranca.Exerc05;

public class Investimento {
    private String codigo;
    private double valorInicial;

    public Investimento(String codigo, double valorInicial) {
        this.codigo = codigo;
        this.valorInicial = valorInicial;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValorInicial() {
        return valorInicial;
    }
}

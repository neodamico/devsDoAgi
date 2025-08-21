package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc02;

/*
 Crie uma classe Investimento com:
Atributo valorAplicado.

Metodo calcularRendimento() que retorna sempre 0.
 */

public class Investimento {
    protected double valorAplicado;

    protected Investimento(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    protected double calcularRendimento() {
        return 0;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

}

package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc02;

/*
 Crie uma classe Investimento com:
Atributo valorAplicado.

Metodo calcularRendimento() que retorna sempre 0.
 */

public class Investimento {
    public double valorAplicado;

    public Investimento(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double calcularRendimento() {
        return 0;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }
}

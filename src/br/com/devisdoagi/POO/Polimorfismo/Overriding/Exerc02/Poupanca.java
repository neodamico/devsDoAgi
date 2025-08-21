package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc02;

/*

No Main, crie um array de Investimento e exiba o rendimento de cada investimento chamando calcularRendimento().

 */

public class Poupanca extends Investimento {
    protected Poupanca (double valorAplicado){
        super(valorAplicado);
    }

    @Override
    protected double calcularRendimento(){
        return valorAplicado * 0.005;
    }



}

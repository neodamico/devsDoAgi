package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc02;
/*
Crie duas subclasses:
Poupanca (sobrescreve calcularRendimento() para retornar 0.5% ao mês).
CDB (sobrescreve calcularRendimento() para retornar 1% ao mês).
No Main, crie um array de Investimento e exiba o rendimento de cada investimento chamando calcularRendimento().

 */
public class CDB extends Investimento {
    protected CDB (double valorAplicado){
        super(valorAplicado);
    }

    @Override
    protected double calcularRendimento (){
        return valorAplicado * 0.01;

    }
}

package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc02;

/*
Exercício 2 – Juros de Investimento
Enunciado:
 Crie uma classe Investimento com:
Atributo valorAplicado.

Metodo calcularRendimento() que retorna sempre 0.


Crie duas subclasses:
Poupanca (sobrescreve calcularRendimento() para retornar 0.5% ao mês).
CDB (sobrescreve calcularRendimento() para retornar 1% ao mês).
No Main, crie um array de Investimento e exiba o rendimento de cada investimento chamando calcularRendimento().
*/


public class Main {
    public static void main(String[] args) {
        Investimento[] inv = new Investimento[3];

        inv[0] = new Investimento(1500);
        inv[1] = new CDB(1500);
        inv[2] = new Poupanca(1500);

        for (Investimento x : inv){
            System.out.println("Rendimento: R$" +x.calcularRendimento());
        }
    }
}

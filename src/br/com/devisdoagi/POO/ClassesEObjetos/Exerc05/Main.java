package br.com.devisdoagi.POO.ClassesEObjetos.Exerc05;

public class Main {
    public static void main(String[] args) {
        FolhaPagamento funcionario = new FolhaPagamento();

        funcionario.nome = "Isidra Gomes";
        funcionario.salarioBruto = 7500.00;
        funcionario.descontoINSS = 500.00;
        funcionario.descontoIR = 1500.00;

        funcionario.calcularSalarioLiquido();
        funcionario.exibirFolhaPagamento();
        System.out.println("O salário liquido de " + funcionario.nome+ " será de: R$" +funcionario.calcularSalarioLiquido());
    }

}

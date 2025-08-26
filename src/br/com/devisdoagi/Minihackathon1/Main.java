package br.com.devisdoagi.Minihackathon1;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Pedro", 4200);
        Funcionario funcionario2 = new Funcionario("Ana", 3500);

        Funcionario gerente = new Gerente(funcionario1.getNome(),funcionario1.getSalario(),2000);
        Funcionario analista = new Analista(funcionario2.getNome(), funcionario2.getSalario(), 1000);


        System.out.println("Cargo de gerencia");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: R$ " + gerente.getSalario());
        System.out.println("Bônus fixo: R$" + ((Gerente) gerente).getBonus());

        System.out.println();

        System.out.println("Cargo de Analista");
        System.out.println("Nome: " + analista.getNome());
        System.out.println("Salário: R$ " + analista.getSalario());
        System.out.println("Bônus fixo: R$" + ((Analista) analista).getBonus());
    }
}

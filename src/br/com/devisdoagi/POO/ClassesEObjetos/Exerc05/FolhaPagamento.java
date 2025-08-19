package br.com.devisdoagi.POO.ClassesEObjetos.Exerc05;

public class FolhaPagamento {
    public String nome;
    public double salarioBruto;
    public double descontoINSS;
    public double descontoIR;

    public double calcularSalarioLiquido(){
        return salarioBruto - descontoINSS - descontoIR;
    }

    public void exibirFolhaPagamento(){
        System.out.println("Nome funcionário: " + this.nome);
        System.out.println("Salário Bruto: R$ " + this.salarioBruto);
        System.out.println("Desconto INSS: R$ " + this.descontoINSS);
        System.out.println("Desconto IR: R$ " + this.descontoIR);

    }

}

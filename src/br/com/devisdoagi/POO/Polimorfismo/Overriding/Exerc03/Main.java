package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc03;

public class Main {
    public static void main(String[] args) {
        Emprestimo[] emprestimo = new Emprestimo[3];

        emprestimo[0] = new Emprestimo(5000);
        emprestimo[1] = new EmprestimoPessoal(5000);
        emprestimo[2] = new EmprestimoEmpresarial(5000);

        for (Emprestimo novo : emprestimo){
            System.out.printf("Valor da parcela em 12 meses R$ %.2f \n",novo.calcularParcela(12));
        }
    }
}

package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc03;

public class EmprestimoEmpresarial extends Emprestimo {

    protected EmprestimoEmpresarial (double valorEmprestado){
        super(valorEmprestado);
    }
    @Override
    protected double calcularParcela (int meses){
        double juros = valorEmprestado * 0.01 * meses;
        return ((valorEmprestado + juros ) / meses) + 100;
    }
}

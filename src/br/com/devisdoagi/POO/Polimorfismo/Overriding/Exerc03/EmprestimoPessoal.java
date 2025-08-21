package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc03;

public class EmprestimoPessoal extends Emprestimo {

    protected EmprestimoPessoal (double valorEmprestado){
        super(valorEmprestado);
    }

    @Override
    protected double calcularParcela (int meses){
        double juros = valorEmprestado * 0.02 * meses;
        return (valorEmprestado + juros) / meses;
    }

}

package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc03;

public class Emprestimo {
    protected double valorEmprestado;

    protected Emprestimo (double valorEmprestado){
        this.valorEmprestado = valorEmprestado;

    }

    protected double calcularParcela (int meses){
        return valorEmprestado/meses;
    }

    public double getValorEmprestado() {
        return valorEmprestado;
    }
}

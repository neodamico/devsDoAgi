package br.com.devisdoagi.POO.Heranca.Exerc01;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeEspecial) {
        super(titular, numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void sacarComLimite(double valor) {
        double saqueTotal = getSaldo() + limiteChequeEspecial;
        if (valor < saqueTotal) {
            System.out.println(saqueTotal-=valor);
        }else{
            System.out.println("Valor Invalido");
        }


    }

    public void exibirDados (){
        System.out.println("Titular: " +getTitular());
        System.out.println("Numero Conta: " +getNumeroConta());

    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}

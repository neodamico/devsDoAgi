package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc04;

public class ContaPoupanca extends ContaBancaria {
    protected ContaPoupanca (String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    protected void gerarRelatorio (){
        double rendimento = saldo * 0.005;
        double saldoFinal = saldo + rendimento;
        System.out.println("Titular: " +titular);
        System.out.println("Saldo Inicial: R$ " +saldo);
        System.out.println("Rendimento mensal: R$" +rendimento);
        System.out.println("Saldo Final: R$ " +saldoFinal);

    }
}


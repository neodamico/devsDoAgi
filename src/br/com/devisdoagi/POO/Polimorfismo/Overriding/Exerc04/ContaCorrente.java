package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc04;

public class ContaCorrente extends ContaBancaria {
    protected ContaCorrente (String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    protected void gerarRelatorio (){
        double novoSaldo = saldo - 20;
        System.out.println("Titular: " +titular);
        System.out.println("Saldo Inicial: R$ " +saldo);
        System.out.println("Desconto da taxa de R$20,00");
        System.out.println("Saldo Final: R$ " +novoSaldo);

    }
}

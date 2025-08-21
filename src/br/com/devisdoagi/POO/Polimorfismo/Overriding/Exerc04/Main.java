package br.com.devisdoagi.POO.Polimorfismo.Overriding.Exerc04;

public class Main {
    public static void main(String[] args) {
        ContaBancaria[] cb = new ContaBancaria[3];

        cb[0] = new ContaBancaria("Nelson",300);
        cb[1] = new ContaCorrente("Giovana", 2000);
        cb[2] = new ContaPoupanca("Thiago",1200);

        for (ContaBancaria conta : cb){
            conta.gerarRelatorio();
            System.out.println("\n");
        }
    }
}

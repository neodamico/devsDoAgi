package br.com.devisdoagi.POO.Heranca.Exerc01;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Nelson", "99564",1000, 500);

        cc.sacarComLimite(800);
        cc.exibirDados();
    }
}

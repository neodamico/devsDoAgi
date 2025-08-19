package br.com.devisdoagi.POO.Encapsulamento.Exerc03;

public class Main {
    public static void main(String[] args) {
        Vip cbVip = new Vip();

        cbVip.setNome("Nelson Damico Junior");
        cbVip.setCpf("111325556-98");
        cbVip.setLimiteCredito(100000);

        cbVip.exibirCliente();
    }
}

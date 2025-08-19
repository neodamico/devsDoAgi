package br.com.devisdoagi.POO.ClassesEObjetos.Exerc04;

public class Main {
    public static void main(String[] args) {
        ConsumoCarro carro = new ConsumoCarro();

        carro.modelo = "Fiat Uno";
        carro.consumoKmPorLitro = 10;


        carro.exibirDados();
        double litros = carro.calcularConsumo(150);
        System.out.println("Será de " + litros + " litros");
    }
}

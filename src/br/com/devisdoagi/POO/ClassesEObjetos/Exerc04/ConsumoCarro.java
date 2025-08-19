package br.com.devisdoagi.POO.ClassesEObjetos.Exerc04;

public class ConsumoCarro {
    public String modelo;
    public double consumoKmPorLitro;

    public double calcularConsumo (double distancia){
        return distancia / consumoKmPorLitro;
    }

    public void exibirDados(){
        System.out.println("O consumo de combustível para a viagem de carro no " +this.modelo +
                " que faz " +consumoKmPorLitro+ " km/l");
    }
}

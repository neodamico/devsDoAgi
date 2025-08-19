package br.com.devisdoagi.Vetores.Exerc01;



public class PrecoMaiorMenor {

    public static double precoMaior(double[]precos){
        double maior = precos[0];
        for(double price : precos){
            if(price > maior){
                maior = price;
            }
        }
        return maior;
    }

    public static double precoMenor(double[]precos){
        double menor = precos[0];
        for(double price : precos){
            if(price < menor){
                menor = price;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        double[]precos ={98.5, 102.0, 100.5, 101.0, 105.0, 107.5, 110.0, 108.5, 106.0, 109.5};
        System.out.println("Maior valor: " +precoMaior(precos));
        System.out.println("Menor preço: " +precoMenor(precos));
    }

}

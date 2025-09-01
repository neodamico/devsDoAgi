package br.com.devisdoagi.ColecoesII.Exerc01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(1,"Alice", "3821066665478"));
        clientes.add(new Cliente(2,"Jonas","1010101010"));
        clientes.add(new Cliente(3,"Marcela","1234567899"));
        clientes.add(new Cliente(4,"Silvio","2582582588"));
        clientes.add(new Cliente(5, "Paloma","4445556660"));

        System.out.println("Clientes cadastrados");
        clientes.forEach(System.out::println);
        System.out.println();

        String cpfBusca = "2582582588";
        for (Cliente c : clientes){
            if(c.getCpf().equals(cpfBusca)){
                System.out.println("Cliente encontrado: " +c);
            }
        }




    }




}

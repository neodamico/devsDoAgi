package br.com.devisdoagi.Colecoes.Exerc08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static void adicionarCompra(Map<String, List<Double>> compras, String cpf, double valorCompra) {
        compras.putIfAbsent(cpf, new ArrayList<>());
        compras.get(cpf).add(valorCompra);
    }

    static double totalGasto(Map<String, List<Double>> compras, String cpf) {
        List<Double>unidade = compras.getOrDefault(cpf, List.of());
        double total = 0.0;

        for (Double valor : unidade){
            total += valor;
        }

        return total;

    }

    static void exibirRelatorio(Map<String, List<Double>> compras){
        compras.forEach((cpf, unidade) -> System.out.println("CPF: " +cpf+ " Total: " +totalGasto(compras, cpf)));
    }

    public static void main(String[] args) {
        HashMap<String, List<Double>>compras = new HashMap<>();

        adicionarCompra(compras,"222", 100);
        adicionarCompra(compras,"222",50);
        adicionarCompra(compras,"222",150);
        totalGasto(compras,"222");
        System.out.println();
        adicionarCompra(compras,"333", 252);
        adicionarCompra(compras,"333",  183.90);
        totalGasto(compras,"333");


        exibirRelatorio(compras);


    }

    }



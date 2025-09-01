package br.com.devisdoagi.Colecoes.Exerc07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static void adicionarParcela(Map<String, List<Double>> emprestimos, String cpf, double valorDeParcela){
        emprestimos.putIfAbsent(cpf, new ArrayList<>());
        emprestimos.get(cpf).add(valorDeParcela);

    }

    static double totalDevedor(Map<String, List<Double>> emprestimos,String cpf){
        List<Double>parcelas = emprestimos.getOrDefault(cpf, List.of());
        double total = 0.0;

        for(Double parcela: parcelas){
            total += parcela;
        }
        return total;
    }

    static void exibirRelatorio(Map<String, List<Double>>emprestimos){
        emprestimos.forEach((cpf, parcelas) -> System.out.println("CPF: "+cpf+ " Total devedor: " +totalDevedor(emprestimos,cpf)));
    }

    public static void main(String[] args) {
        HashMap<String, List<Double>> emprestimos = new HashMap<>();

        adicionarParcela(emprestimos,"222",500);
        adicionarParcela(emprestimos,"222",1000);
        adicionarParcela(emprestimos,"333", 100);
        adicionarParcela(emprestimos,"222",1500);
        adicionarParcela(emprestimos,"333",150);
        System.out.println("-------------------------------------");

        totalDevedor(emprestimos,"222");
        totalDevedor(emprestimos,"333");
        System.out.println("-------------------------------------");

        exibirRelatorio(emprestimos);
    }
}

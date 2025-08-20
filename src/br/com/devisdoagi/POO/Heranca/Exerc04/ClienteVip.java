package br.com.devisdoagi.POO.Heranca.Exerc04;

public class ClienteVip extends Cliente{
    private int nivel;
    private double descontoPercentual;

    public ClienteVip (String nome, String cpf, int nivel, double descontoPercentual){
        super (nome, cpf);
        this.nivel = nivel;
        this.descontoPercentual = descontoPercentual;
    }

    public double calcularPrecoComDesconto (double preco){
        double precoDesconto;
        precoDesconto = preco - (preco * (descontoPercentual/100));

        return precoDesconto;
    }

    public void resumo(){
        System.out.println("Cliente: " +getNome());
        System.out.println("CPF: " +getCpf());
        System.out.println("Nivel: " +nivel);
        System.out.println("Desconto percentual: " +descontoPercentual+ "%" );
        System.out.println("Preço com desconto: " +calcularPrecoComDesconto(100));

    }

}

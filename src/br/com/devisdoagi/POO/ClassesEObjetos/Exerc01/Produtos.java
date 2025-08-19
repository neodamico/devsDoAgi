package br.com.devisdoagi.POO.ClassesEObjetos.Exerc01;

public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;


    public void adicionarEstoque(int quantidade){
       this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade){
        if (quantidade <= this.quantidade){
            this.quantidade -= quantidade;
        }else {
            System.out.println("Estoque insuficiente");
        }

    }

    public void exibirDados(){
        System.out.println("Nome do Produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade disponível: " + this.quantidade);

    }


}

package br.com.devisdoagi.POO.Encapsulamento.Exerc02;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (this.preco < 0){
            this.preco =0;
        }else {
            this.preco = preco;
        }

    }

    public int adicionarEstoque(int adicionar){
        this.estoque += adicionar;

        return this.estoque;
    }

    public int removerEstoque(int remover){
        this.estoque -= remover;

        return this.estoque;
    }

    public void exibirProduto(){
        System.out.println("Produto: " +this.getNome());
        System.out.println("Preço: " +this.getPreco());
        System.out.println("Estoque: " +this.estoque);
    }


}

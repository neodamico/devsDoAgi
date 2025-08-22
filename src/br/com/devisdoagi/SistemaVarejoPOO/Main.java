package br.com.devisdoagi.SistemaVarejoPOO;

public class Main {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Nelson Damico", "meuemail@mail");
        ProdutoFisico prodfis = new ProdutoFisico(001, "Livro",50.00, cli.getNome());
        ProdutoDigital prodDig = new ProdutoDigital(002, "PDF do Livro",20.00, cli.getNome());

        prodfis.aumentarPreco(10);
        prodfis.calcularFrete();

        prodDig.aplicarDesconto(10);

        System.out.println("Produto físico: " +prodfis.getNomeProduto());
        System.out.println("Preço Final: R$" +prodfis.getPreco());
        System.out.println("Frete: R$" +prodfis.calcularFrete());

        System.out.println();

        System.out.println("Produto físico:  " +prodDig.getNomeProduto());
        System.out.println("Preço Final: R$" +prodDig.getPreco());
        System.out.println("Frete: R$" +prodDig.calcularFrete());
    }

}

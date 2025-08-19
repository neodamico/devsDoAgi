package br.com.devisdoagi.POO.Encapsulamento.Exerc03;

public class Vip {
    private String nome;
    private String cpf;
    private double limiteCredito;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if(limiteCredito >= 1000 && limiteCredito <= 100000){
            this.limiteCredito = limiteCredito;
        }else {
            this.limiteCredito = 0;
        }

    }

    public void exibirCliente(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Limite de crédito: " +limiteCredito);
    }


}

package br.com.devisdoagi.POO.ClassesEObjetos.Exerc03;

public class MediaAluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia(){
        return (nota1 + nota2) /2;
    }

    public String verificarSituacao(){
        if (calcularMedia() >= 7 ){
          return "Você foi aprovado";
        } else if (calcularMedia() > 4 && calcularMedia() <= 6) {
            return "Você está de recuperação";
        } else {
            return "Você está reprovado";
        }

    }

    public void exibirRelatorio(){
        System.out.println("Nome do Aluno: " +this.nome);
        System.out.println("Média do Aluno: " +this.calcularMedia());
        System.out.println("Situação: " + this.verificarSituacao());
    }




}

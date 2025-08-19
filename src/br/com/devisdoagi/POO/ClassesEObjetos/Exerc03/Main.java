package br.com.devisdoagi.POO.ClassesEObjetos.Exerc03;

public class Main {
    public static void main(String[] args) {
        MediaAluno aluno = new MediaAluno();
        MediaAluno aluno2 = new MediaAluno();
        MediaAluno aluno3 = new MediaAluno();

        aluno.nome = "Nelson Damico Junior";
        aluno2.nome = "Maria luiza Damico Matarazo";
        aluno3.nome = "Gustavo Damico Pereira";

        aluno.nota1 = 8;
        aluno.nota2 = 7;

        aluno2.nota1 = 5;
        aluno2.nota2 = 6;

        aluno3.nota1 = 3;
        aluno3.nota2 = 4;

        aluno.exibirRelatorio();
        System.out.println();
        aluno2.exibirRelatorio();
        System.out.println();
        aluno3.exibirRelatorio();
    }
}

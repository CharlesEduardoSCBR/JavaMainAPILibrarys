package br.com.alura.c4;

import java.util.Set;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

       Set<Aluno> alunos = javaColecoes.getAlunos();

       //tente adicionar mais um aluno no Set de alunos (sempre sem acentos)
       Aluno a4 = new Aluno("Charles Eduardo", 1234);
       
       alunos.matricula(a4);
	}
}

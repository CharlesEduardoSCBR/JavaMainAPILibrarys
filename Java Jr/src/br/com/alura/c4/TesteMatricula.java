package br.com.alura.c4;

public class TesteMatricula {

	public static void main(String[] args) {
		Curso c;
		Aluno a1, a2, a3;
		
		a1 = new Aluno("José", 1);
		a2 = new Aluno("João", 2);
		a3 = new Aluno("Jenival", 3);
		
		c = new Curso("Java", "Silveira");
		c.matricula(a1);
		c.matricula(a2);
		c.matricula(a3);
		
		System.out.println(c.getAlunos());
		
	}

}

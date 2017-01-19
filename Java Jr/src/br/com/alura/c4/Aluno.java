package br.com.alura.c4;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "[Nome : " + this.nome + ", Numero da Matricula: " + this.numeroMatricula;
	}

}

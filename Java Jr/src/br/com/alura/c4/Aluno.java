package br.com.alura.c4;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) throws NullPointerException{
		if (nome.isEmpty()) {
			throw new NullPointerException("Não pode ser nulo");
		}
		
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
	
	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		return this.nome.equals(aluno);	
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

}

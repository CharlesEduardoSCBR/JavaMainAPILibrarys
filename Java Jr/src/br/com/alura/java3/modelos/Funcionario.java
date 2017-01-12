package br.com.alura.java3.modelos;

import java.util.Calendar;
import java.util.Date;

public class Funcionario {
	private String nome;
	private int idade;
	private Date dataNascimento;

	public Funcionario() {
	}

	public Funcionario(String nome, int idade, Calendar dataNascimento){
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento.getTime();
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return "Funcionario: " + this.getNome(); 
	}
}

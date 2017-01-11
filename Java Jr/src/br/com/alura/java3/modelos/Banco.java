package br.com.alura.java3.modelos;

import java.util.LinkedList;
import java.util.List;

public class Banco {

	private List<Conta> contas;

	public Banco() {
		this.contas = new LinkedList<>();
	}

	public void adiciona(Conta c) {
		this.contas.add(c);
	}

	public Conta pega(int x) {
		return contas.get(x);
	}

	public int pegaQuantidadeDeContas() {
		return contas.size();
	}
}
package br.com.alura.java3.modelos;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Banco {

	private List<Conta> contas;
	private Map<String, Conta> mapaContas;

	public Banco() {
		this.contas = new LinkedList<>();
	}

	public void adiciona(Conta c) {
		this.contas.add(c);
		this.mapaContas.put(c.getNome(), c);
	}

	public Conta pega(int x) {
		return contas.get(x);
	}

	public int pegaQuantidadeDeContas() {
		return contas.size();
	}
	
	public Conta buscaPorNome(String nome){
		return mapaContas.get(nome);
	}
}
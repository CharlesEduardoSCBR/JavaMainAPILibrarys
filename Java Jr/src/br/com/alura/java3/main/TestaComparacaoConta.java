package br.com.alura.java3.main;

import br.com.alura.java3.modelos.Conta;
import br.com.alura.java3.modelos.ContaCorrente;

public class TestaComparacaoConta {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();

		c1.setNumero(1);
		c2.setNumero(1);

		System.out.println(c1.equals(c2));
	}

}
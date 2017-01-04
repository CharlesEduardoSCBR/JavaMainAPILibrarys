package br.com.alura.java3.main;

import br.com.alura.java3.modelos.Conta;
import br.com.alura.java3.modelos.ContaCorrente;

public class TestaComparacaoConta {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();

		c1.setNumero(1);
		c1.setNome("Pedro");
		
		c2.setNumero(1);
		c2.setNome("Regina");

		if (c1.equals(c2)) {
			System.out.println("Com equal igual...");
		} else {
			System.out.println("Com equal diferente...");
		}

		if (c1 == c2) {
			System.out.println("Iguais com ==");
		} else {
			System.out.println("Diferentes com ==");
		}
	}

}

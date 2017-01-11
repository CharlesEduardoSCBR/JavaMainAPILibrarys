package br.com.alura.java3.main.aula5;

import java.util.HashSet;
import java.util.Set;

import br.com.alura.java3.modelos.Conta;
import br.com.alura.java3.modelos.ContaCorrente;

public class TestaContaExer17 {

	public static void main(String[] args) {
		Set<Conta> c = new HashSet<>();

		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		Conta c3 = new ContaCorrente();
		
		c1.setNumero(1);
		c2.setNumero(1);
		c3.setNumero(1);
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		System.out.println(c);
		
	}

}

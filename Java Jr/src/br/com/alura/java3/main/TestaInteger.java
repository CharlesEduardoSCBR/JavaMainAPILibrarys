package br.com.alura.java3.main;

import br.com.alura.java3.modelos.Conta;
import br.com.alura.java3.modelos.ContaCorrente;

public class TestaInteger {
	public static void main(String[] args) {

		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
				
		if (x1 == x2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}

		
		Conta c = new ContaCorrente();
		System.out.println(c);
	}
	
	
}

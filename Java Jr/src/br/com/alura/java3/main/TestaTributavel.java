package br.com.alura.java3.main;

import br.com.alura.java3.modelos.ContaCorrente;
import br.com.alura.java3.modelos.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
	}
}

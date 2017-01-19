package br.com.alura.c4;

import java.util.TreeSet;

public class TestaRecibo {

	public static void main(String[] args) {
		Recibo rec1 = new Recibo();
		rec1.setNumero(1);
		Recibo rec2 = new Recibo();
		rec2.setNumero(2);
		Recibo rec3 = new Recibo();
		rec3.setNumero(3);
		
		TreeSet<Recibo> r = new TreeSet<>();
		r.add(rec1);
		r.add(rec2);
		r.add(rec3);

	}

}

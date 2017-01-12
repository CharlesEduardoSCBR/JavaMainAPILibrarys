package br.com.alura.java3.main.aula5;

import java.util.Random;
import java.util.TreeSet;

public class TestaOrdemDecrescenteExerc18 {

	public static void main(String[] args) {
		TreeSet<Integer> c = new TreeSet<>();
		Random r = new Random();

		for (int i = 0; i < 1000; i++) {
			c.add(r.nextInt(1000));
		}
		
		for (int inversoOrdem : c.descendingSet()) {
			System.out.println(inversoOrdem);
		}
	}
}

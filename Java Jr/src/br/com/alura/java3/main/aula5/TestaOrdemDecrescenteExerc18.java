package br.com.alura.java3.main.aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestaOrdemDecrescenteExerc18 {

	public static void main(String[] args) {
		List<Integer> c = new ArrayList<>();
		Random r = new Random();

		for (int i = 0; i < 1000; i++) {
			c.add(r.nextInt(1000));
		}
		
		Collections.sort(c, Collections.reverseOrder());

		for (int inversoOrdem : c) {
			System.out.println(inversoOrdem);
		}
	}
}

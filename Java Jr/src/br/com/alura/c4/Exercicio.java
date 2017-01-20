package br.com.alura.c4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");
		
		Set<Integer> s = pessoas.keySet();
		
		for (Integer chave : s) {
			System.out.println(chave);
		}

	}

}

package br.com.alura.c4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		
		Set l2 = nomesParaIdade.keySet();
		Collection<Integer> l = nomesParaIdade.values();
		
		System.out.println(l);
		
		for (Integer integer : l) {
			System.out.println(integer);
		}
		
		for (Object object : l2) {
			System.out.println(object);
		}

	}

}

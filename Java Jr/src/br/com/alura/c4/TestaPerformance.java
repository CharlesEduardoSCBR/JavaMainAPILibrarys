package br.com.alura.c4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		
		long inicio;
		long fim;
		long tempoDeExecucao;
		
		Collection<Integer> numeros = new ArrayList<Integer>();
		Collection<Integer> numerosSet = new HashSet<>();

		inicio = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}

		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;
		System.out.println("Fim inserção ArrayList: " + tempoDeExecucao);

		inicio = System.currentTimeMillis();
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;
		System.out.println("Tempo gasto busca ArrayList: " + tempoDeExecucao);
		
		inicio = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			numerosSet.add(i);
		}
		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;
		System.out.println("Fim inserção HashSett: " + tempoDeExecucao);
		
		inicio = System.currentTimeMillis();
		for (Integer numero : numeros) {
			numerosSet.contains(numero);
		}

		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;
		System.out.println("Tempo gasto busca HashSet: " + tempoDeExecucao);
	}

}

package br.com.alura.java3.main.aula5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
        Collection<Integer> teste = new HashSet<Integer>();
        long inicio = System.currentTimeMillis();

		int total = 100000;

		System.out.println("Inserindo elementos na lista:");
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
        
        inicio = System.currentTimeMillis();
        System.out.println("Pesquisando elementos na lista:");
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);

	}

}

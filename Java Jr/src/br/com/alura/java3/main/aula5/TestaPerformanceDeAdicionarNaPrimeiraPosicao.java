package br.com.alura.java3.main.aula5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		System.out.println("Iniciando LinkedList...");
        long inicio = System.currentTimeMillis();

        // trocar depois por ArrayList                
        List<Integer> teste = new LinkedList<>();

        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);
        
        System.out.println("Iniciando LinkedList...");
        inicio = System.currentTimeMillis();

        // trocar depois por ArrayList                
        List<Integer> teste2 = new ArrayList<>();

        for (int i = 0; i < 30000; i++) {
            teste2.add(0, i);
        }

        fim = System.currentTimeMillis();
        tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);
	}

}

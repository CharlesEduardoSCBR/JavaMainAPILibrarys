package br.com.alura.java3.main.aula5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.java3.modelos.Conta;
import br.com.alura.java3.modelos.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {

		List<ContaPoupanca> contas = new LinkedList<>();

		for (int i = 0; i < 20; i++) {
			ContaPoupanca conta = new ContaPoupanca();
			String nome = "Conta" + i;
			conta.setNumero(i);
			conta.setNome(nome);
			contas.add(conta);
		}

		Collections.sort(contas);
		
		for (ContaPoupanca contaPoupanca : contas) {
			System.out.println(contaPoupanca);
		}
	}

}

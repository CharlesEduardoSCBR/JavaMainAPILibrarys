package br.com.alura.java3.main.c5.m1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import br.com.alura.controle.modelo.Gasto;
import br.com.alura.java3.modelos.Funcionario;

public class TestaGasto {

	public static void main(String[] args) {

		Calendar dataNascimento = new GregorianCalendar(1985, 3, 18);
		Funcionario f1 = new Funcionario("Jose's1", 1, dataNascimento);
		Funcionario f2 = new Funcionario("Jose's2", 2, dataNascimento);
		Funcionario f3 = new Funcionario("Jose's3", 3, dataNascimento);

		
		Gasto g1 = new Gasto(100.00, "particular", f1, dataNascimento, true);
		Gasto g2 = new Gasto(200.00, "privado", f2, dataNascimento, true);
		Gasto g3 = new Gasto(300.00, "particular", f3, dataNascimento, false);
		
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		
		
	}

}

package br.com.alura.empresa.leitor;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import br.com.alura.controle.modelo.Gasto;
import br.com.alura.java3.modelos.Funcionario;

public class Importador {
	public List<Gasto> importa(InputStream entrada) throws ParseException {
		Scanner leitor = new Scanner(entrada);
		List<Gasto> gastos = new ArrayList<Gasto>();
		while (leitor.hasNextLine()) {
			SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
			String line = leitor.nextLine();
			String inicioImportacao = line.substring(0, 6);
			String dataImportacao = line.substring(6, 14);
			String valorImportado = line.substring(14, 23);
			String matriculaImportacao = line.substring(23, 26);
			String nome = line.substring(26, 56);
			String dataNascimentoImportacao = line.substring(56);
			double valor = Double.parseDouble(valorImportado);
			int matricula = Integer.parseInt(matriculaImportacao);
			Calendar dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(df.parse(dataNascimentoImportacao));
			Calendar dataDespesa = Calendar.getInstance();
			dataDespesa.setTime(df.parse(dataImportacao));
			Funcionario funcionario = new Funcionario(nome, matricula, dataNascimento);
			gastos.add(new Gasto(valor, inicioImportacao, funcionario, dataDespesa));
		}
		return gastos;
	}
}

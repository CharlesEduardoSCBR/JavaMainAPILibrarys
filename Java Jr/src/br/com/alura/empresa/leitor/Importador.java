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
	private SimpleDateFormat dataGastoImportacao = new SimpleDateFormat("ddMMyyyy");

	public List<Gasto> importa(InputStream entrada) throws ParseException {
		Scanner leitor = new Scanner(entrada);
		List<Gasto> gastos = new ArrayList<Gasto>();

		while (leitor.hasNextLine()) {
			String line = leitor.nextLine();
			String tipoDeGastoImportacao = line.substring(0, 6);
			String dataImportacao = line.substring(6, 14);
			String valorImportacao = line.substring(14, 23);
			String matriculaImportacao = line.substring(23, 26);
			String nome = line.substring(26, 56);
			String dataNascimentoImportacao = line.substring(56);
			double valor = Double.parseDouble(valorImportacao);
			int matricula = Integer.parseInt(matriculaImportacao);
			Calendar dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(dataGastoImportacao.parse(dataNascimentoImportacao));
			Calendar dataDespesa = Calendar.getInstance();
			dataDespesa.setTime(dataGastoImportacao.parse(dataImportacao));
			Funcionario funcionario = new Funcionario(nome, matricula, dataNascimento);
			gastos.add(new Gasto(valor, tipoDeGastoImportacao, funcionario, dataDespesa));
		}
		return gastos;
	}
}

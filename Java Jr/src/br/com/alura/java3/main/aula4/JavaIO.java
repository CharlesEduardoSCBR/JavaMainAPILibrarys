package br.com.alura.java3.main.aula4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIO {

	public static void main(String[] args) throws IOException {

		String pathArquivo = "C:/Users/charl_000/Documents/Cursos/Alura/Trilhas/Java III/Java Jr/Java Jr/src/br/com/alura/java3/arq/arquivo.txt";

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(pathArquivo)));

		System.out.println("Digite sua mensagem:");
		String linha = br.readLine(); // primeira linha

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();
	}
}

package br.com.alura.java3.main.aula4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {

	public static void main(String[] args) throws IOException {
		//InputStream is = new FileInputStream("arquivo.txt");
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua mensagem:");
		while (entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}
		entrada.close();
	}

}

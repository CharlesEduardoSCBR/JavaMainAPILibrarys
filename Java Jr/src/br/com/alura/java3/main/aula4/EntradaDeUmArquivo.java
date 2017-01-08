package br.com.alura.java3.main.aula4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
        PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
        while (entrada.hasNextLine()) {
            saida.println(entrada.nextLine());
        }
        saida.close();
        entrada.close();
	}
}

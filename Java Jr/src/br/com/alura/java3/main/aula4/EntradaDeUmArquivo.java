package br.com.alura.java3.main.aula4;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {

	public static void main(String[] args) throws IOException {

		String pathArquivo = "C:/Users/charl_000/Documents/Cursos/Alura/Trilhas/Java III/Java Jr/Java Jr/src/br/com/alura/java3/arq/arquivo.txt";

		Scanner entrada = new Scanner(new FileInputStream(pathArquivo));
        PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
        while (entrada.hasNextLine()) {
            saida.println(entrada.nextLine());
        }
        saida.close();
        entrada.close();
	}
}

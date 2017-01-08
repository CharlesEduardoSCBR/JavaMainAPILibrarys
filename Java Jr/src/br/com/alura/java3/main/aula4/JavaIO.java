package br.com.alura.java3.main.aula4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JavaIO {

	public static void main(String[] args) throws IOException {

		InputStream psLeitor = System.in;
		InputStreamReader isr = new InputStreamReader(psLeitor);
		BufferedReader br = new BufferedReader(isr);

		String s = br.readLine();

		System.out.println(s);

	}
}

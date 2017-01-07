package br.com.alura.java3.main;

public class Exercicio11 {
	
	public void imprimirPalavraLetraPorLinha(String palavra){
		int tamanhoPalavra = palavra.length();
		for (int i = 0; i < tamanhoPalavra; i++) {
			System.out.println(palavra.charAt(i));
		}
	}

	public void imprimirFraseInversa(String frase){
		int indexInverso;
		int tamanhoFrase; 
		
		tamanhoFrase = frase.length();
		for (int i = 0; i < tamanhoFrase; i++) {
			indexInverso = (tamanhoFrase - (i + 1));
			System.out.println(frase.charAt(indexInverso));
		}
	}
	
	public void imprimirFraseInversa2(String frase){
		StringBuilder sb = new StringBuilder();
		sb.append(frase);
		System.out.println(sb.reverse());
	}
	public void imprimirFraseInversaComSplitPor(String frase){
		String palavras[];
		String fraseDevolvida;
		int quantidadeDePalavras; 
		
		fraseDevolvida = "";
		palavras = frase.split(" ");
		quantidadeDePalavras = palavras.length;
		for (int i = quantidadeDePalavras; i > 0; i--) {
			fraseDevolvida += palavras[i-1] + " ";
		}
		System.out.println(fraseDevolvida);
	}
	
	public void stringParaNumero(String valor){
		StringBuilder sb = new StringBuilder();
		//sb.append(valor.)
	}
	
	public static void main(String[] args) {
		String alura = "Alura";	
		String s1 = "Socorram-me, subi no ônibus em Marrocos"; 
		String s2 = "anotaram a data da maratona";
		String s3 = "Marrocos em ônibus no subi Socorram-me,";
		
		Exercicio11 e = new Exercicio11();
		
		e.imprimirFraseInversa2(s2);
		
	}
}

package br.com.alura.c4;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		//1) adicione alguns alunos
        alunos.add("João");
        alunos.add("Maria");
        alunos.add("José");
        
        //2) imprima o tamanho da colecao
        System.out.println(alunos.size());
        
        //3) tente adicionar um aluno que existe
        alunos.add("Maria");
        
        //4) imprima novamente o tamanho da colecao
        System.out.println(alunos.size());
	}

}

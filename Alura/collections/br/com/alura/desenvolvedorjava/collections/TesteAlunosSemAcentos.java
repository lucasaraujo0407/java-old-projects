package br.com.alura.desenvolvedorjava.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Lucas");
		alunos.add("Paulo");
		alunos.add("Diego");
		alunos.add("Renato");

		System.out.println(alunos.size());
		
		alunos.add("Lucas");
		
		System.out.println(alunos.size());
		
		boolean adicionou = alunos.add("Paulo");
		System.out.println("Paulo foi adicionado ao Set? " + adicionou);
	}

}

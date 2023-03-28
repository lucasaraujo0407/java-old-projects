package br.com.alura.desenvolvedorjava.collections;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Maurício");
		alunos.add("Lucas");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}

}

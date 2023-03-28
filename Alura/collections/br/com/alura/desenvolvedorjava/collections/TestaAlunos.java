package br.com.alura.desenvolvedorjava.collections;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Lucas");
		alunos.add("Paulo");
		alunos.add("Pedro");
		alunos.add("Júlio");
		
		System.out.println(alunos);
		
		alunos.add("Maryana");
		alunos.add("Thais");
		alunos.add("Thais");
		
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
	}

}

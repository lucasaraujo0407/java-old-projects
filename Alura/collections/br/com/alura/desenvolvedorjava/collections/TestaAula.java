package br.com.alura.desenvolvedorjava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as arrays", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();		
		aulas.add(a1); 
		aulas.add(a2);
		aulas.add(a3);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		//aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		
	}

}

package br.com.alura.desenvolvedorjava.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExecutaCurso {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();		
		cursos.add(new Curso("Phyton", 45));
		cursos.add(new Curso("Javascript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		//Ou também:
		//cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		cursos.stream()
			//.mapToInt(c -> c.getAlunos())
			//.average()
			//.collect(Collectors.toList())
		
			//.filter(c -> c.getAlunos() >= 50)
			//.findFirst()
			.forEach(c -> System.out.println(c.getNome()));			
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
	}

}

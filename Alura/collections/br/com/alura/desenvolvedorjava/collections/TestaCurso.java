package br.com.alura.desenvolvedorjava.collections;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es no Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();		
		System.out.println(aulas);
		
		/*javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 21));
		System.out.println(aulas);*/
		
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando", 28));
		
		System.out.println(javaColecoes.getAulas());		
	}

}

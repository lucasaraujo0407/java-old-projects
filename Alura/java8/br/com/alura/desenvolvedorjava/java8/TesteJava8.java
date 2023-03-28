package br.com.alura.desenvolvedorjava.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteJava8 {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("Alura online");
		palavras.add("Casa do Código");
		palavras.add("Caellum");

//		Consumer<String> compara = new Comparavel();
//		palavras.forEach(compara);
				
		palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
						
		palavras.sort(Comparator.comparing(String::length));
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
							
		new Thread(() -> System.out.println("Executando um runnable")).start();   
				
//		ComparadorPorTamanho comparador = new ComparadorPorTamanho();
//		Collections.sort(palavras, comparador);
		System.out.println(palavras);
	}
}

class Comparavel implements Consumer<String> {

	@Override
	public void accept(String p) {
		System.out.println(p);
	}
}

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
}

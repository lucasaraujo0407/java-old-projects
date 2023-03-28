package br.com.alura.desenvolvedorjava.testes;

public class TestesEx3Mod3 {

	public static void imprimeLetraPorLetra(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println(" ");
	}

	public static void imprimeDeTrasPraFrente(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println(" ");
		System.out.println(" ");
	}

	public static void imprimePalavrasNaOrdemInvertida(String s) {
		String[] frase = s.split(" ");
		for (int i = frase.length - 1; i >= 0; i--) {
			System.out.print(frase[i] + " ");
		}
		System.out.println("\n");
	}

	public static void imprimePalavrasNaOrdemInvertidaStringBuilder(String s) {
		StringBuilder buffer = new StringBuilder(s);
		buffer.reverse();
		System.out.println(buffer);
		System.out.println();

		// Correção Alura
		// Pode-se criar a variável de referência já utilizando o método
		// reverse()
		StringBuilder buffer2 = new StringBuilder(s).reverse();
		System.out.println(buffer2);
	}

	public static int converteStringParaNumero(String numero) {

		int resultado = 0;
		while (numero.length() > 0) {
			char algarismo = numero.charAt(0);
			resultado = resultado * 10 + (algarismo - '0');
			numero = numero.substring(1);
		}
		return resultado;
	}

	public static void main(String[] args) {
		imprimeLetraPorLetra("Alura");
		imprimeDeTrasPraFrente("Socorram-me, subi no ônibus em Marrocos");
		imprimePalavrasNaOrdemInvertida("Socorram-me, subi no ônibus em Marrocos");
		imprimePalavrasNaOrdemInvertidaStringBuilder("Socorram-me, subi no ônibus em Marrocos");

		String numero = "762";
		System.out.println("\nImprimindo a string: " + numero);

		int resultado = converteStringParaNumero(numero);
		System.out.println("Imprimindo o int: " + resultado);
		/*
		 * String s = "Alura"; for (int i = 0; i < s.length(); i++) {
		 * System.out.println(s.charAt(i)); }
		 */
	}
}

package br.com.alura.desenvolvedorweb.bibliotecas.banco;

import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.ContaCorrente;

public class TestaComparaçãoConta {
	public static void main(String[] args) {		
		ContaCorrente c1 = new ContaCorrente(6, "Lucas");
		ContaCorrente c2 = new ContaCorrente(6, "Lucas");
		
		if(c1 == c2){
			System.out.println("Iguais");
		}
		else{
			System.out.println("Diferentes");
		}
		
		if(c1.equals(c2)){
			System.out.println("Iguais");
		}
		
		else{
			System.out.println("Diferentes");
		}
	}
}

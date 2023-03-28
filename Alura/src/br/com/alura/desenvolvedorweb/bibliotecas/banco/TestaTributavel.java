package br.com.alura.desenvolvedorweb.bibliotecas.banco;

import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.ContaCorrente;
import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(0, "Lucas");
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		//Testando polimorfismo
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		//System.out.println(t.getSaldo());
	}
}

package br.com.alura.desenvolvedorweb.bibliotecas.banco;

import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.ContaCorrente;
import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.GerenciadorDeImpostoDeRenda;
import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente(0, "Lucas");
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		
		System.out.println(gerenciador.getTotal());
		
		System.out.printf("O saldo é: %.2f", cc.getSaldo());
	}
}

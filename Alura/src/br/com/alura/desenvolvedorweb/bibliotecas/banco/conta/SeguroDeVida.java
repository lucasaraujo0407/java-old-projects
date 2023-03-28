package br.com.alura.desenvolvedorweb.bibliotecas.banco.conta;

public class SeguroDeVida implements Tributavel{
	@Override
	public double calculaTributos() {
		return 42;
	}
}

package br.com.alura.desenvolvedorweb.bibliotecas.banco.conta;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	public void adiciona(Tributavel t){
		System.out.println("Adicionando tributável: " + t);
		
		this.total = t.calculaTributos();
	}
	
	public double getTotal(){
		return this.total;
	}
}

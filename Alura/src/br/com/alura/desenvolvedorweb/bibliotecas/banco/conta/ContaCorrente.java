package br.com.alura.desenvolvedorweb.bibliotecas.banco.conta;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 2;
	}
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}

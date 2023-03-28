package br.com.alura.desenvolvedorweb.bibliotecas.banco.conta;

public class ContaPoupanca extends Conta /*implements Comparable<ContaPoupanca> */{
	/*
	 * public void atualiza(double taxa){ this.saldo += this.saldo * taxa * 3; }
	 */	
	
	public ContaPoupanca(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	public void atualiza(double taxa) {
		// TODO Auto-generated method stub

	}

	
}

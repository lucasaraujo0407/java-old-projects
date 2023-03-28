package br.com.alura.desenvolvedorweb.bibliotecas.banco.sistema;

import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	public void roda(Conta c){
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo atual: " + c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}
	
	public double getSaldoTotal(){
		return this.saldoTotal;
	}	
	
}

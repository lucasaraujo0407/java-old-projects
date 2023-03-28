package br.com.alura.desenvolvedorweb.bibliotecas.banco.conta;

abstract public class Conta implements Comparable<Conta> {
	protected double saldo;
	protected int numero;
	public String nome;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	abstract public void atualiza(double taxa);

	@Override
	public String toString() {
		return "Esse objeto é uma conta com saldo R$" + this.saldo + " e pertence ao " + this.nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int compareTo(Conta outra) {
		return this.nome.compareTo(outra.nome);
	}

	public String getNome() {		
		return this.nome;
	}
}
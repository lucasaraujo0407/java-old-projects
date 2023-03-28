package br.com.alura.desenvolvedorweb.bibliotecas.banco;

import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.Conta;
import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.ContaCorrente;
import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.ContaPoupanca;
import br.com.alura.desenvolvedorweb.bibliotecas.banco.sistema.AtualizadorDeContas;

public class testaConta {

	public static void main(String[] args) {
		//Conta c = new Conta();
		Conta cc = new ContaCorrente(0, "Lucas");
		Conta cp = new ContaPoupanca(1, "Lucas2");

		//c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		// c.atualiza(0.01);
		// cc.atualiza(0.01);
		// cp.atualiza(0.01);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		//adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		//System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

		System.out.println("Saldo total: " + adc.getSaldoTotal());
		
		/*Conta conta = new ContaCorrente();
		System.out.println(conta);*/
	}

}

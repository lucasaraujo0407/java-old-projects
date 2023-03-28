package br.com.alura.desenvolvedorweb.bibliotecas.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.Conta;
import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {

		List<Conta> contas = new LinkedList<Conta>();
		Random random = new Random();

		ContaPoupanca c1 = new ContaPoupanca(random.nextInt(2000), "Lucas");
		c1.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c1);

		ContaPoupanca c2 = new ContaPoupanca(random.nextInt(2000), "Diego");
		c2.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c2);

		ContaPoupanca c3 = new ContaPoupanca(random.nextInt(2000), "Renato");
		c3.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c3);
		
		Collections.sort(contas);

		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
}

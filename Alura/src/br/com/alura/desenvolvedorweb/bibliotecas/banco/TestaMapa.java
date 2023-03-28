package br.com.alura.desenvolvedorweb.bibliotecas.banco;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.Conta;
import br.com.alura.desenvolvedorweb.bibliotecas.banco.conta.ContaCorrente;

public class TestaMapa {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente(1, "Lucas");
		c1.deposita(10000);
		
		Conta c2 = new ContaCorrente(2, "Leandro");
		c2.deposita(30000);
		
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		mapaDeContas.put("Diretor", c1);
		mapaDeContas.put("Gerente", c2);
		
		Conta contaDoDiretor = mapaDeContas.get("Diretor");
		System.out.println(contaDoDiretor.getSaldo());

	}

}

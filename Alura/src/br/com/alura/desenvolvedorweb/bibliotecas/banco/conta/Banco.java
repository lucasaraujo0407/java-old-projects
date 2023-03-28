package br.com.alura.desenvolvedorweb.bibliotecas.banco.conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	
	private List<Conta> contas = new ArrayList<>();
	private Map<String, Conta> indexadoPorNome = new HashMap<>();
	
	public void adiciona(Conta conta){
		contas.add(conta);
		indexadoPorNome.put(conta.getNome(), conta);
	}
	
	public Conta pega(int posicao){
		return contas.get(posicao);
	}
	
	public int pegaQuantidadeDeContas(){
		return contas.size();
	}
	
	public Conta buscaPorNome(String nome){
		return indexadoPorNome.get(nome);
	}
}

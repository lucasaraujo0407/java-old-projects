package br.com.alura.desenvolvedorjava.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {		
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}	
}
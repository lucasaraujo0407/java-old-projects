package br.com.alura.desenvolvedorjava.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual);
		
		LocalDate data2099 = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(data2099);
		
		Period periodo = Period.between(data2099, dataAtual);
		System.out.println(periodo);
		
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valor = data2099.format(formatar);
		System.out.println(valor);

	}
}

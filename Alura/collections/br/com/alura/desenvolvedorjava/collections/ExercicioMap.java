package br.com.alura.desenvolvedorjava.collections;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(21, "Lucas");
		pessoas.put(27, "Alberto");
		pessoas.put(89, "Juca");
		pessoas.put(23, "Josi");
		
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
	}			

}

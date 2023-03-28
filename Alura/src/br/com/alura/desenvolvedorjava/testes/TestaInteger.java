package br.com.alura.desenvolvedorjava.testes;

public class TestaInteger {

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		if (x1.equals(x2)){
			System.out.println("Igual");
		}else{
			System.out.println("Diferente");
		}
		
		x1.parseInt("10");
		x2.parseInt("Teste");
				
	}

}

package orientacaoAObjetos.excecoes;

public class TesteErro {
	public static void main(String[] args) {
		System.out.println("Início do Main");
		try{
			m1();
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Erro: " + e);
		}
		System.out.println("Fim do Main");
	}

	private static void m1() {
		System.out.println("Início do m1");
		m2();				
		System.out.println("Fim do m1");	
	}

	private static void m2() {
		System.out.println("Início do m2");
		int[] array = new int[10];
		for(int i = 0; i <= 15; i++){
			array[i] = i;
			System.out.println(i);			
		}		
		System.out.println("Início do m2");
		
	}
}

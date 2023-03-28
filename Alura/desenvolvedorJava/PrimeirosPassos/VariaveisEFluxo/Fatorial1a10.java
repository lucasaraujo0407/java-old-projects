package PrimeirosPassos.VariaveisEFluxo;
public class Fatorial1a10 {

	public static void main(String[] args) {		
		long fatorial = 1;
		for(int i = 1; i <= 50; i++){
			fatorial *= i;
			System.out.println("Fatorial de " + i + " é igual a " + fatorial);
		}
		
	}
}

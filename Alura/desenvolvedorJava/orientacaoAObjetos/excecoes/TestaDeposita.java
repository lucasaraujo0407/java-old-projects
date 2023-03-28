package orientacaoAObjetos.excecoes;

public class TestaDeposita {

	public static void main(String[] args) {
		Conta cp = new ContaCorrente();
		try{
			cp.deposita(-100);
		}
		//catch(ValorInvalidoException e){
		//CORRE��O ALURA:
		//Como a frase n�o est� passada no construtor, � preciso coloc�-la manualmente:
		catch(ValorInvalidoException e){
			System.out.println(e.getMessage());
		}
	}
}

package orientacaoAObjetos.excecoes;

public class TestaDeposita {

	public static void main(String[] args) {
		Conta cp = new ContaCorrente();
		try{
			cp.deposita(-100);
		}
		//catch(ValorInvalidoException e){
		//CORREÇÃO ALURA:
		//Como a frase não está passada no construtor, é preciso colocá-la manualmente:
		catch(ValorInvalidoException e){
			System.out.println(e.getMessage());
		}
	}
}

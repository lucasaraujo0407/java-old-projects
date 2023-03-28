package orientacaoAObjetos.excecoes;

abstract public class Conta {
	protected double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	/*public void deposita(double valor)throws IllegalArgumentException{
		this.saldo += valor;
	}*/
	//Correção Alura - Throw dentro do método, não no começo
	public void deposita(double valor){
		if(valor < 0){			
			throw new ValorInvalidoException(valor);
		}
		else{
			this.saldo += valor;
		}
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	abstract public void atualiza(double taxa);		
}

class ContaCorrente extends Conta implements Tributavel{
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 2;
	}
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}

class ContaPoupanca extends Conta{
	/*public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 3;
	}*/
	
	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}

	
	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		
	}
}

class SeguroDeVida implements Tributavel{

	@Override
	public double calculaTributos() {
		return 42;
	}
	
}
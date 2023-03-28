package orientacaoAObjetos.classesAbstratas;

abstract public class Conta {
	protected double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca(double valor){
		this.saldo -= valor;
	}
	
	abstract public void atualiza(double taxa);		
}

class ContaCorrente extends Conta{
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 2;
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
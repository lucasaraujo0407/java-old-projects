package PrimeirosPassos.ComecandoComOO;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	//Data dataEntrada;
	//Corre��o Alura
	//Declarar o campo dataEntrada j� criando o objeto da classe Data
	Data dataEntrada = new Data();
	String rg;
	
	void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	double calculaGanhoAnual(){
		//return salario * 12;
		
		//Corre��o Alura
		//Colocar o this. N�o � obrigat�rio, mas � um bom h�bito
		return this.salario * 12;
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Sal�rio: " + this.salario);
		/*System.out.println("Dia: " + this.dataEntrada.dia);
		System.out.println("M�s: " + this.dataEntrada.mes);
		System.out.println("Ano: " + this.dataEntrada.ano);*/
		System.out.println("Data de entrada: " + this.dataEntrada.getFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
	}
	
}

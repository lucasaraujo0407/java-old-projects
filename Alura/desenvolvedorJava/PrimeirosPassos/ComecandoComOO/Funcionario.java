package PrimeirosPassos.ComecandoComOO;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	//Data dataEntrada;
	//Correção Alura
	//Declarar o campo dataEntrada já criando o objeto da classe Data
	Data dataEntrada = new Data();
	String rg;
	
	void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	double calculaGanhoAnual(){
		//return salario * 12;
		
		//Correção Alura
		//Colocar o this. Não é obrigatório, mas é um bom hábito
		return this.salario * 12;
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		/*System.out.println("Dia: " + this.dataEntrada.dia);
		System.out.println("Mês: " + this.dataEntrada.mes);
		System.out.println("Ano: " + this.dataEntrada.ano);*/
		System.out.println("Data de entrada: " + this.dataEntrada.getFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
	}
	
}

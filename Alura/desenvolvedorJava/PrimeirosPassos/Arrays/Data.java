package PrimeirosPassos.Arrays;

public class Data {
	int dia;
	int mes;
	int ano;
	
	/*void imprimeData(){
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}*/
	
	//Corre��o Alura
	//Fun��o correta para o preenchimento de data:
	void preencheData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	/*void getFormatada(){
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}*/
	//Corre��o Alura
	//Colocar a fun��o como String para retornar algo poss�vel para  ser impresso
	//com o sysout
	String getFormatada(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}

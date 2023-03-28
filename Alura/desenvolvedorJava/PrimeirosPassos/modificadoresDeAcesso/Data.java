package PrimeirosPassos.modificadoresDeAcesso;

public class Data {
	int dia;
	int mes;
	int ano;
	
	/*void imprimeData(){
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}*/
	
	//Correção Alura
	//Função correta para o preenchimento de data:
	void preencheData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	/*void getFormatada(){
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}*/
	//Correção Alura
	//Colocar a função como String para retornar algo possível para  ser impresso
	//com o sysout
	String getFormatada(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}

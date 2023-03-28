package PrimeirosPassos.atributosEMetodosEstaticos;

public class Data {
	int dia;
	int mes;
	int ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if(!isDataViavel(dia, mes, ano)){
			System.out.println("A data " + getFormatada() + " não existe!");
		}
	}
	
	public Data() {
		
	}

	private boolean isDataViavel(int dia, int mes, int ano){
		if (dia <= 0 || mes <= 0 || mes > 12 || ano <= 0)
			return false;
		
		int ultimoDiaDoMes = 31;
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
			ultimoDiaDoMes = 30;
		else if (mes == 2){
			ultimoDiaDoMes = 28;
			if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
				ultimoDiaDoMes = 29;
			}
		}
		
		if(dia > ultimoDiaDoMes){
			return false;
		}
		
		return true;
	}
	
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

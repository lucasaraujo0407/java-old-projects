package PrimeirosPassos.ComecandoComOO;

public class testaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Hugo";
		f1.salario = 1000;
		f1.departamento = "Compras";
		f1.dataEntrada = new Data(); 
		//O campo dataEntrada vira uma referência pra objeto da classe Data 
		f1.rg = "47.903.706-1";
		f1.recebeAumento(100);
		
		//Correção Alura
		//Adição do método preencheData();
		f1.dataEntrada.preencheData(4, 7, 1990);
		
		f1.mostra();							
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Carlos";
		f2.salario = 2000;
		
		Funcionario f3 = new Funcionario();
		f3.nome = "Carlos";
		f3.salario = 2000;
		
		if(f2 == f3){
			System.out.println("Iguais");
		}
		else{
			System.out.println("Diferentes");
		}
		
		Funcionario f4 = new Funcionario();
		f4.nome = "Hugo";
		f4.salario = 2000;		
		
		Funcionario f5 = f4;		
		
		if(f4 == f5){
			System.out.println("Iguais");
		}
		else{
			System.out.println("Diferentes");
		}
	}

}

package PrimeirosPassos.modificadoresDeAcesso;

public class testaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();		
		//empresa.empregados = new Funcionario[10];
		
		empresa.setEmpregados(new Funcionario[10]);
		
		/*for (int i = 0; i < 5; i++){
			Funcionario f = new Funcionario();
			f.salario = 1000 + i * 100;
			empresa.adiciona(f);
		}*/
		
		//Corre��o Alura
		//Inser��o de Funcionarios
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		f1.setNome("Lucas");
		f1.setDepartamento("DAS");
		f1.setData(new Data());
		f1.getData().preencheData(4, 7, 1990); 
		f1.setRg("47.908-909-X");		
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f2.setSalario(1700);
		f2.setData(new Data());
		empresa.adiciona(f2);
		
		//empresa.empregados[0].mostra();
		//empresa.empregados[1].mostra();
		
		//empresa.mostraEmpregados();
		empresa.mostraTodasAsInformacoes();
		empresa.contem(f1);
		empresa.contem(f2);
	}
}

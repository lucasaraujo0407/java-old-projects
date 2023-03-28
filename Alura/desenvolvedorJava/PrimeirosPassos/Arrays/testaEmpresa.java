package PrimeirosPassos.Arrays;

public class testaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();		
		empresa.empregados = new Funcionario[10];
		
		/*for (int i = 0; i < 5; i++){
			Funcionario f = new Funcionario();
			f.salario = 1000 + i * 100;
			empresa.adiciona(f);
		}*/
		
		//Correção Alura
		//Inserção de Funcionarios
		Funcionario f1 = new Funcionario();
		f1.salario = 1000;
		f1.nome = "Lucas";
		f1.departamento = "DAS";
		f1.dataEntrada = new Data();
		f1.dataEntrada.preencheData(4, 7, 1990);
		f1.rg = "47.908-909-X";		
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f2.salario = 1700;
		f2.dataEntrada = new Data();
		empresa.adiciona(f2);
		
		//empresa.empregados[0].mostra();
		//empresa.empregados[1].mostra();
		
		//empresa.mostraEmpregados();
		empresa.mostraTodasAsInformacoes();
		empresa.contem(f1);
		empresa.contem(f2);
	}
}

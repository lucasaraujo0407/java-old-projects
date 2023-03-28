package PrimeirosPassos.Arrays;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	// Data dataEntrada;
	// Correção Alura
	// Declarar o campo dataEntrada já criando o objeto da classe Data
	Data dataEntrada = new Data();
	String rg;

	void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	double calculaGanhoAnual() {
		// return salario * 12;

		// Correção Alura
		// Colocar o this. Não é obrigatório, mas é um bom hábito
		return this.salario * 12;
	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: " + this.salario);
		/*
		 * System.out.println("Dia: " + this.dataEntrada.dia);
		 * System.out.println("Mês: " + this.dataEntrada.mes);
		 * System.out.println("Ano: " + this.dataEntrada.ano);
		 */
		System.out.println("Data de entrada: " + this.dataEntrada.getFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho anual: " + this.calculaGanhoAnual());
	}
}

class Empresa {
	String nome;
	String cnpj;
	String endereco;
	// Funcionario[] funcionario = new Funcionario[10];

	// Correção Alura
	// Array colocado dessa forma:
	Funcionario[] empregados;

	/*
	 * void adicionar(Funcionario f){ int i =0; Funcionario[] funcionario = new
	 * Funcionario[10]; for(i = 0; i < funcionario.length; i++){ if
	 * (funcionario[i] == null) continue; this.funcionario[i]
	 * 
	 * } }
	 */

	// Correção Alura
	// Inclusão da variável livre e método adiciona:
	int livre = 0;

	void adiciona(Funcionario f) {
		this.empregados[this.livre] = f;
		this.livre++;
	}

	void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			/*
			 * Comentado porque o método mostraTodasAsInformacoes se encarrega
			 * de fazer a validação if (this.empregados[i] == null) break;
			 */
			System.out.println("Funcionário na posição: " + i);
			System.out.println("R$" + this.empregados[i].salario);

		}
	}

	/*
	 * void mostraTodasAsInformacoes(){ for (int i = 0; i <
	 * this.empregados.length; i++){ this.mostraEmpregados(); } }
	 */

	// Correção Alura
	// Método pra mostrar tudo no array, utilizando o método mostraEmpregados()
	void mostraTodasAsInformacoes() {
		for (int i = 0; i < this.livre; i++) {
			System.out.println("Funcionário na posição " + i);
			this.empregados[i].mostra();
		}
	}

	boolean contem(Funcionario f) {
		for (int i = 0; i < this.livre; i++) {
			// if (f)
			// Correção Alura
			// Não deixar de validar a referência com a posição de momento no for
			if (f == this.empregados[i]) {
				System.out.println(this.empregados[i].nome);
				return true;
			}			
		}
		return false;
	}

}

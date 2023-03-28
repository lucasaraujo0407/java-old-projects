package PrimeirosPassos.Arrays;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	// Data dataEntrada;
	// Corre��o Alura
	// Declarar o campo dataEntrada j� criando o objeto da classe Data
	Data dataEntrada = new Data();
	String rg;

	void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	double calculaGanhoAnual() {
		// return salario * 12;

		// Corre��o Alura
		// Colocar o this. N�o � obrigat�rio, mas � um bom h�bito
		return this.salario * 12;
	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Sal�rio: " + this.salario);
		/*
		 * System.out.println("Dia: " + this.dataEntrada.dia);
		 * System.out.println("M�s: " + this.dataEntrada.mes);
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

	// Corre��o Alura
	// Array colocado dessa forma:
	Funcionario[] empregados;

	/*
	 * void adicionar(Funcionario f){ int i =0; Funcionario[] funcionario = new
	 * Funcionario[10]; for(i = 0; i < funcionario.length; i++){ if
	 * (funcionario[i] == null) continue; this.funcionario[i]
	 * 
	 * } }
	 */

	// Corre��o Alura
	// Inclus�o da vari�vel livre e m�todo adiciona:
	int livre = 0;

	void adiciona(Funcionario f) {
		this.empregados[this.livre] = f;
		this.livre++;
	}

	void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			/*
			 * Comentado porque o m�todo mostraTodasAsInformacoes se encarrega
			 * de fazer a valida��o if (this.empregados[i] == null) break;
			 */
			System.out.println("Funcion�rio na posi��o: " + i);
			System.out.println("R$" + this.empregados[i].salario);

		}
	}

	/*
	 * void mostraTodasAsInformacoes(){ for (int i = 0; i <
	 * this.empregados.length; i++){ this.mostraEmpregados(); } }
	 */

	// Corre��o Alura
	// M�todo pra mostrar tudo no array, utilizando o m�todo mostraEmpregados()
	void mostraTodasAsInformacoes() {
		for (int i = 0; i < this.livre; i++) {
			System.out.println("Funcion�rio na posi��o " + i);
			this.empregados[i].mostra();
		}
	}

	boolean contem(Funcionario f) {
		for (int i = 0; i < this.livre; i++) {
			// if (f)
			// Corre��o Alura
			// N�o deixar de validar a refer�ncia com a posi��o de momento no for
			if (f == this.empregados[i]) {
				System.out.println(this.empregados[i].nome);
				return true;
			}			
		}
		return false;
	}

}

package PrimeirosPassos.modificadoresDeAcesso;

public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	// Data dataEntrada;
	// Correção Alura
	// Declarar o campo dataEntrada já criando o objeto da classe Data
	private Data dataEntrada = new Data();
	private String rg;

	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getDepartamento(){
		return this.departamento;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;			
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	
	public Data getData(){
		return this.dataEntrada;
	}
	
	public void setData(Data dataEntrada){
		this.dataEntrada = dataEntrada;
	}
	
	public String getRg(){
		return this.rg;
	}
	
	public void setRg(String rg){
		this.rg = rg;	
	}
	
	//Correção Alura
	//Renomeando o método	
	//public double calculaGanhoAnual() {
	public double getGanhoAnual() {
		// return salario * 12;

		// Correção Alura
		// Colocar o this. Não é obrigatório, mas é um bom hábito
		return this.salario * 12;
	}

	public void mostra() {
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
		System.out.println("Ganho anual: " + this.getGanhoAnual());
	}
}

class Empresa {
	private String nome;
	private String cnpj;
	private String endereco;
	// Funcionario[] funcionario = new Funcionario[10];

	// Correção Alura
	// Array colocado dessa forma:
	private Funcionario[] empregados;

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
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;			
	}

	public String getCnpj(){
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;		
	}
	
	public String getEndereco(){
		return this.endereco;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public Funcionario getFuncionario(int posicao){
		return this.empregados[posicao];
	}
	
	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}
	
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
			System.out.println("R$" + this.empregados[i].getSalario());

		}
	}

	/*
	 * void mostraTodas{AsInformacoes(){ for (int i = 0; i <
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
				System.out.println(this.empregados[i].getNome());
				return true;
			}			
		}
		return false;
	}

}

package PrimeirosPassos.modificadoresDeAcesso;

public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	// Data dataEntrada;
	// Corre��o Alura
	// Declarar o campo dataEntrada j� criando o objeto da classe Data
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
	
	//Corre��o Alura
	//Renomeando o m�todo	
	//public double calculaGanhoAnual() {
	public double getGanhoAnual() {
		// return salario * 12;

		// Corre��o Alura
		// Colocar o this. N�o � obrigat�rio, mas � um bom h�bito
		return this.salario * 12;
	}

	public void mostra() {
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
		System.out.println("Ganho anual: " + this.getGanhoAnual());
	}
}

class Empresa {
	private String nome;
	private String cnpj;
	private String endereco;
	// Funcionario[] funcionario = new Funcionario[10];

	// Corre��o Alura
	// Array colocado dessa forma:
	private Funcionario[] empregados;

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
			 * Comentado porque o m�todo mostraTodasAsInformacoes se encarrega
			 * de fazer a valida��o if (this.empregados[i] == null) break;
			 */
			System.out.println("Funcion�rio na posi��o: " + i);
			System.out.println("R$" + this.empregados[i].getSalario());

		}
	}

	/*
	 * void mostraTodas{AsInformacoes(){ for (int i = 0; i <
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
				System.out.println(this.empregados[i].getNome());
				return true;
			}			
		}
		return false;
	}

}

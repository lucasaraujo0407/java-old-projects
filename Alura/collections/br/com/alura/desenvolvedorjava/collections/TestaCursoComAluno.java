package br.com.alura.desenvolvedorjava.collections;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções no Java", "Paulo Silveira");				
		
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Lucas", 29);
		Aluno a2 = new Aluno("Pedro", 39);
		Aluno a3 = new Aluno("Paulo", 37);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		javaColecoes.getAlunos().forEach(aluno ->
			System.out.println(aluno)
		);
		
		System.out.println(javaColecoes.buscaMatriculado(37));
		
		//javaColecoes.getAlunos().add(a3);
				
		System.out.println(javaColecoes.estaMatriculado(a1));
	}

}

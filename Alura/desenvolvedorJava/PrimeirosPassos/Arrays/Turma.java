package PrimeirosPassos.Arrays;

class Turma {
	Aluno[] alunos;
	
	void imprimeNotas(){
		for (int i = 0; i < alunos.length; i++) {
			Aluno aluno = this.alunos[i];
			if(aluno == null) continue;
			System.out.println(aluno.nota);
		}
	}	
}

class Aluno{
	String nome;
	int nota;
}

class testeDaTurma{
	public static void main(String[] args) {
		Turma fj11 = new Turma();
		fj11.alunos = new Aluno[10];
		
		fj11.alunos[0] = new Aluno();
		fj11.alunos[0].nome = "Maur�cio";
		fj11.alunos[0].nota = 9;
		
		fj11.alunos[1] = new Aluno();
		fj11.alunos[1].nome = "Marcelo";
		fj11.alunos[1].nota = 5;
		
		fj11.alunos[2] = new Aluno();
		fj11.alunos[2].nome = "Lucas";
		fj11.alunos[2].nota = 10;
		
		fj11.imprimeNotas();
	}
}

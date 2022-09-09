package relacionamento_muitos_para_muitos;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("WEB 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome);
			System.out.println("...e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		//A partir do "aluno(x) eu peguei os curso desse aluno e depois peguei todos os alunos do curso(x)
		// "x" pode ser substituido pelo número do aluno (como por exemplo aluno1 no exemplo abaixo) e o outro "x", pode
		// ser substituído pelo numero do indice do curso que foi adicionado (no caso do exemplo abaixo seria o 0 que
		//referencia o curso1)
		System.out.println(aluno3.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("React Native");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}

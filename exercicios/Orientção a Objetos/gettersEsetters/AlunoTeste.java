package gettersEsetters;

public class AlunoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Jorge Almeida Santos");
		aluno1.setIdade(20);
		
		System.out.printf("\nObrigado por se cadastrar na plataforma\nNome: %s\nIdade: %d", aluno1.getNome(), aluno1.getIdade());
		
	}
}

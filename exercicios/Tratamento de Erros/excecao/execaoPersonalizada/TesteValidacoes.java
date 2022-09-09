package excecao.execaoPersonalizada;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		// O recurso "finally é chamado independente do erro, ele sempre vai ser chamado obrigatoriamente
		
		Aluno aluno = new Aluno("Ana", 7);
		
		try {
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervalo | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
}

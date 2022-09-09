package stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Bia", 4.5);
		Aluno a2 = new Aluno("Fernando", 8.2);
		Aluno a3 = new Aluno("Karen", 6.1);
		Aluno a4 = new Aluno("Claudio", 7.0);
		Aluno a5 = new Aluno("Laura", 9.5);
		Aluno a6 = new Aluno("Jeferson", 5.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)";
		
		alunos.stream().filter(aprovado).map(saudacaoAprovado).forEach(System.out::println);
	}
}

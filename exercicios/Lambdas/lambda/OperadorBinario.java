package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
//Deixa em funções melhores ajuda a reutilizar as funções lambda. Como foi mostrado no exemplo BinaryOperator e Function.
// Que no caso faz a mesma coisa que BiFunction mas de forma mais simples e reduzida
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.7, 5.8));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(8.5, 3.0));
		
		System.out.println("\nUSANDO COMPOSIÇÃO DE FUNÇÕES !!!!\n");
		
		Function<Double, String> conceito = med -> med >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(conceito).apply(8.5, 6.0));
	}
}

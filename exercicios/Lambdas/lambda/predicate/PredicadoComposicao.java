package lambda.predicate;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> is3Digitos = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(is3Digitos).negate().test(123));
		System.out.println(isPar.or(is3Digitos).test(99));
	}
}

package lambda.predicate;

import java.util.function.Predicate;

public class Predicado {
//Predicate recebe um punico parâmetro e sempre vai retornar um valor verdadeiro ou falso
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> prod.preco >= (prod.preco * (1 - prod.desconto));
		
		Produto produto = new Produto("Notebook", 3456.32, 0.15);
		System.out.println(isCaro.test(produto));
	}
}

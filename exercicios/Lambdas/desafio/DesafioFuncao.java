package desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambda.predicate.Produto;

public class DesafioFuncao {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Ipad", 3235.89, 0.13);
		@SuppressWarnings("unused")//Apenas outro exemplo
		Produto produto2 = new Produto("RTX 3090", 10599.99, 0.71);
		
		Function<Produto, Double> precoDesconto = p -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> imposto = i -> i >= 2500 ? i * (1 + 0.085) : i;
		UnaryOperator<Double> frete = f -> f >= 3000 ? f + 100 : f + 50;
		
		double resultado = precoDesconto.andThen(imposto).andThen(frete).apply(produto);
		
		System.out.printf("Total a pagar do produto incluindo imposto (caso devido), e frete (variando com o preço"
				+ "do produto) é de R$%.2f", resultado);
	}
}
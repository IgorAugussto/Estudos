package lambda;

import java.util.function.BinaryOperator;

public class CalculoTest2 {

//BinaryOperator só aceita a versão objeto dos tipos primitivos.
	public static void main(String[] args) {
		
		BinaryOperator<Double> somar = (x, y) -> {return x + y;};
		System.out.println(somar.apply(2.0, 3.0));
		
		BinaryOperator<Double> multiplicar = (x, y) -> x * y;
		System.out.println(multiplicar.apply(2.0, 3.0));
	}
}

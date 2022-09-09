package lambda.supplies;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
//Essa função não recebe nada como parâmetro e retorna alguma coisa.
	
	public static void main(String[] args) {
		
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println(umaLista.get());
	}
}

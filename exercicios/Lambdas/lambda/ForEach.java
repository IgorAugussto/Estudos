package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
	}
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);			
		}
		
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod reference #01...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\n Lambda #02...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		//Para o fucionamento correto desse exemplo, dentro do parenteses é necessário usar o nome da classe que nesse caso
		// é "ForEach", pois o método "meuImprimir" faz parte da classe "ForEach" nesse caso.
		System.out.println("\nMethod reference #02...");
		aprovados.forEach(ForEach::meuImprimir);
	}
}

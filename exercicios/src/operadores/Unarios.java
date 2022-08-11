package operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		/*Ambas operações de b são iguais a de , exceto por um fator, quando o "+" está antes da letra significa que
		temos pressa para executar esse incremento, como no exemplo de comparação abaixo*/
		++b; 
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		/*Na linha 23 o resultado é verdadeiro pois como o incremento vem antes da letra "a" o Java vai primeiro incrementer
		 deixando a letra "a" valendo 2 igual a "b" definido na linha 6, e em seguida ele vai comparar com "b", sendo assim 
		 um resultado verdadeiro*/
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // true
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}
}

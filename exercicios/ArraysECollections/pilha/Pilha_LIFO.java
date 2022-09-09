package pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha_LIFO {
	public static void main(String[] args) {
		// Last in First out
		
		Deque<String> livro = new ArrayDeque<>();
		
		livro.add("O Pequeno Prícipe");
		livro.push("Don Quixote");
		livro.push("O Hobbit");
		
		for(String pilha: livro) {
			System.out.println(pilha);
		}
		
		System.out.println(livro.peek());
		System.out.println(livro.element());
	}
}

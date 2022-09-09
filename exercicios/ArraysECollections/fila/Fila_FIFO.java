package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila_FIFO {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add -> Adicionam elemntos na fila
		// Diferença é o comportamento quando a fila está cheia
		fila.add("Ana");// Retorna false
		fila.offer("Bia");// Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		
		// Peek e element -> obter o próximo elemento da fila (sem remover)
		
		// Diferença é o comportamento que ocorre quando a fila está vazia
		System.out.println(fila.peek());// Retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// Lança uma exceção
		System.out.println(fila.element());
		
		// Poll e remove -> obter o próximo elemento da fila e remove
		
		// Diferença é o comportamento que ocorre quando a fila está vazia
		System.out.println(fila.poll());// Retorna null
		System.out.println(fila.poll());// Lança uma exceção
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		
//		fila.size(); -> Tamanho da fila
//		fila.clear(); -> Limpa a fila
//		fila.isEmpty(); -> Pergunta se a fila está vazia ou não
//		fila.contains();
	}
}

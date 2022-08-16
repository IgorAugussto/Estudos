package desafios;

import java.util.Scanner;

public class DesadioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String diaSemana = entrada.next();
		entrada.close();
		
		if(diaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println("O número desse dia é 1");
		} else if(diaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println("O número desse dia é 2");
		} else if(diaSemana.equalsIgnoreCase("Terça")) {
			System.out.println("O número desse dia é 3");
		} else if(diaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println("O número desse dia é 4");
		} else if(diaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println("O número desse dia é 5");
		} else if(diaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println("O número desse dia é 6");
		} else if(diaSemana.equalsIgnoreCase("Sábado")) {
			System.out.println("O número desse dia é 7");
		} else {
			System.out.println("Dia da semana inválido !!\nEscola um dia válido");
		}
	}
}

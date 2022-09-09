package desafios;

import java.util.Scanner;

public class NotasTeste {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int qtdeNotas;
		double media;
		
		
		System.out.println("Quantas notas você deseja informar?");
		qtdeNotas = entrada.nextInt();
		double[] notasAluno = new double[qtdeNotas];
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notasAluno[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double notas: notasAluno) {
			total += notas;
		}
		
		entrada.close();
		
		media = total / qtdeNotas;
		
		System.out.println("Sua média é: " + media);
		
		
	}
}

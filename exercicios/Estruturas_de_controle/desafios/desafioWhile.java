package desafios;

import java.util.Scanner;

public class desafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		System.out.println("Digite uma frase ou palavra.");
		entrada.nextLine();
		
		while(!valor.equalsIgnoreCase("Sair")) {
			System.out.println("\nPara encerrar o programa digite 'Sair', ou para continuar digite outra frase ou palavra.");
			valor = entrada.nextLine();
		}
		entrada.close();
		
		System.out.println("Você saiu do programa!");
	}
}

package desafios;

public class CalculoMedia {
	
	public static void main(String[] args) {
		
		int a = 0;
		int num = 0;
		
		while(a <= 1000) {
			if(a % 2 == 1) {
				num += a;
			}
			a++;
		}
		int media = num / a;
		
		System.out.printf("A média da soma dos números ímpares entre 1 e 1000 é de: %d", media);
	}
}

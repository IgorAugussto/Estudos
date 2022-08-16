package for_ex;

public class For02 {
	public static void main(String[] args) {
		// i recebe zero; i vai até 10 (na verdade 9 pois nesse caso está começando no zero); indo de 1 em 1
		// no caso desse exemplo a fazer primeiro o laço mais interno depois o laço externo. 
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				System.out.printf("[%d &d]", i, j);
			}
		}
	}
}

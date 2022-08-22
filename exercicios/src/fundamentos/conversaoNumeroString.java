package fundamentos;

public class conversaoNumeroString {

	public static void main(String[] args) {
		/*O Integer é o wrapp, usado para usar notações pontos em tipo primitivos como o int no exemplo. E pode ser usado
		também diretamento no sysout*/
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		// tbm de outra forma mas não muito comum é possivle concatenar um string vazia para transformar o numeor em string
		System.out.println(("" + num2).length());
	}

}

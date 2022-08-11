package operadores;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		/*Objetivo do exercicio é usar o ".equals()" para compara Strings e não "==". Também um ponto de observação é usar
		 ".trim()" para cortar/excluir os espaços em branco.(.next() já tira os espaços em branco automáticamento, já o 
		 .nextLine() não exlcui os espaços em branco). */
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
	}
}

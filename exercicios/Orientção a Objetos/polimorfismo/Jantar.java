package polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa(80.00);
		Arroz arroz = new Arroz(0.250);
		Feijao feijao = new Feijao(0.760);
		Sorvete sorvete = new Sorvete(0.200);
		
		System.out.println(pessoa.getPeso());
		
		pessoa.comer(arroz);
		pessoa.comer(feijao);
		
		System.out.println(pessoa.getPeso());
		
		pessoa.comer(sorvete);
		
		System.out.println(pessoa.getPeso());
	}
}

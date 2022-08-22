package desafios;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		/*Desafio é criar uma classe produto na qual a regra de negócio é que todos os produtos vão ter 25% de desconto,
		salva exceções onde é dia das mães que o desconto fica de 30% e natal que fica 40%. Foi usado contrutores, métodos
		e modificadores de acesso para essa atividad*/
		
		System.out.println("PREÇO NORMAL!!");
		Produto p1 = new Produto("Cadeira Gamer Roxtor LED Branca", 1861.90);
		Produto p2 = new Produto("Pc Gamer Intel Core i7", 2790);
		System.out.printf("Produto: %s\nPreço: %.2f\n", p1.nome, p1.descontoPadrao());
		System.out.printf("Produto: %s\nPreço: %.2f", p2.nome, p2.descontoPadrao());
		
		
		System.out.println("\n\nDESCONTO DE DIA DAS MÃES!!");
		Produto p3 = new Produto("Cadeira Gamer Roxtor LED Branca", 1861.90);
		Produto p4 = new Produto("Pc Gamer Intel Core i7", 2790);
		System.out.printf("Produto: %s\nPreço: %.2f\n", p3.nome, p3.descontoMaes());
		System.out.printf("Produto: %s\nPreço: %.2f", p4.nome, p4.descontoMaes());
		
		System.out.println("\n\nDESCONTO DE NATAL!!");
		Produto p5 = new Produto("Cadeira Gamer Roxtor LED Branca", 1861.90);
		Produto p6 = new Produto("Pc Gamer Intel Core i7", 2790);
		System.out.printf("Produto: %s\nPreço: %.2f\n", p5.nome, p5.descontoNatal());
		System.out.printf("Produto: %s\nPreço: %.2f", p6.nome, p6.descontoNatal());
		
	}
}

package desafio.filter;

public class Produto {
	
	final String nome;
	final double preco;
	final double desconto;
	final boolean freteGratis;
	
	public Produto(String nome, double preco, double desconto, boolean frete) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.freteGratis = frete;
	}	
}

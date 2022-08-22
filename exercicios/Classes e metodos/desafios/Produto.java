package desafios;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	static double descontoMaes = 0.30;
	static double descontoNatal = 0.40;
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double descontoPadrao() {
		return preco * (1 - desconto);
	}
	
	double descontoMaes() {		
		return preco * (1 - descontoMaes);
	}
	
	double descontoNatal() {
		return preco * (1 - descontoNatal);
	}
	
	
}

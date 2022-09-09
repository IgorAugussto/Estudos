package desafio.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Camiseta", 39.90, 0.15, false);
		Produto p2 = new Produto("Mapa-múndi", 40.00, 0.30, true);
		Produto p3 = new Produto("Fone de ouvido", 75.70, 0.10, false);
		Produto p4 = new Produto("Notebook", 2499.90, 0.50, true);
		Produto p5 = new Produto("PC Gamer", 12000.00, 0.35, false);
		Produto p6 = new Produto("Polaroide", 80.75, 0.15, true);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> isFreteGratis = frete -> frete.freteGratis;
		Predicate<Produto> desconto = d -> d.desconto >= 0.30;
		Function<Produto, String> resultadoTela = resultado -> "\nProduto: " + resultado.nome + "\nValor: " + resultado.preco
				+ "\nDesconto: " + resultado.desconto;
		
		System.out.println("SUPER OFERTA!!! Produto com frete grátis e desconto maior que 30%!!");
		
		produtos.stream().filter(isFreteGratis).filter(desconto).map(resultadoTela).forEach(System.out::println);;
	}
}

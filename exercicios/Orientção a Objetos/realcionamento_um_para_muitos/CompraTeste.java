package realcionamento_um_para_muitos;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra = new Compra();
		compra.cliente = "João Pedro";
		compra.itens.add(new Item("Caneta", 20, 7.50));
		compra.itens.add(new Item("Lápis", 7, 3.80));
		compra.itens.add(new Item("Caderno", 3, 6.70));
		
		System.out.println(compra.obterValorTotal());
	}
}

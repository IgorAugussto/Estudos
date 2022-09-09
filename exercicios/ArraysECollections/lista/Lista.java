package lista;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		//Pode ser feito dessa forma
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		// Ou dessa forma também.
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3).nome);
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}
}

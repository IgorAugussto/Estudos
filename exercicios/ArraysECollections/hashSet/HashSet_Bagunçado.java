package hashSet;

import java.util.HashSet;
import java.util.Set;

// ctrl + 1 em cima da advertencia para poder retirar.
public class HashSet_Bagunçado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1); /*Todos os hashset não aceitam tipo primitivos, porem são convertidos automaticamente. Nesse
		caso para um Integer.*/
		conjunto.add('x');
		conjunto.add(3.5);
		conjunto.add("teste");
		conjunto.add(true);
		
		System.out.println("O tamanho é " +conjunto.size());
		System.out.println(conjunto.add("teste"));
		System.out.println(conjunto.add('x'));
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("O tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums) faz a união entre os dois conjuntos
//		System.out.println(conjunto.addAll(nums));
//		System.out.println(conjunto);
		
		
		System.out.println(conjunto.retainAll(nums));
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}

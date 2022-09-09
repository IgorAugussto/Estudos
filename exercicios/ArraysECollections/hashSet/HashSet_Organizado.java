package hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Organizado {
 public static void main(String[] args) {
	 
	 //TreeSet garante a ordem de alfabetica, já o HashSet não.
	
	 //Set<String> listaAprovados = new HashSet<>();
	 Set<String> listaAprovados = new TreeSet<>();
	 
	 listaAprovados.add("Fabio");
	 listaAprovados.add("Alexandre");
	 listaAprovados.add("Rogério");
	 listaAprovados.add("Mario");
	 listaAprovados.add("Roberto");
	 
	 for(String candidato: listaAprovados) {
		 System.out.println(candidato);
	 }
	 
	 Set<Integer> nums = new HashSet<>();
	 
	 nums.add(1);
	 nums.add(2);
	 nums.add(5);
	 nums.add(130);
	 nums.add(6);
	 
	 for(int numeros: nums) {
		 System.out.println(numeros);
	 }	 
  }
}

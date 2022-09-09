package equalsEhashcode;

import java.util.Date;

public class EqualsTeste {
	public static void main(String[] args) {
		
		Equals u1 = new Equals();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@gmail.coom";
		
		Equals u2 = new Equals();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@gmail.coom";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date()));
	}	
}

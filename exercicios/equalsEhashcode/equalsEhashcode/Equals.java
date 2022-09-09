package equalsEhashcode;

public class Equals {
	String nome;
	String email;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Equals) {
			Equals outro = (Equals) obj;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}		
	}
}

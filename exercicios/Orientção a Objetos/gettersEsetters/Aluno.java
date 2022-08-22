package gettersEsetters;

public class Aluno {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade > 0 && idade < 130) {
			this.idade = idade;
			System.out.println("Usuario cadatrado.");
		} else {
			System.out.println("Erro! Idade inválida");
		}
	}
	
}

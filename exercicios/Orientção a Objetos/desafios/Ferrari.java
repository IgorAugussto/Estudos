package desafios;

public class Ferrari extends Carro {

	@Override
	 public void acelerar() {
		velocidadeAtual += 15;
	}
	
	public Ferrari(){
		super(200);
	}
}

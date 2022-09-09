package desafios;

public class Carro {
	
	public int velocidadeAtual = 0;
	public final int VELOCIDADE_MAXIMA;
	protected int delta = 5;
	
//	Carro(){
//		this(200);
//	}
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual = velocidadeAtual + delta;			
		}
	}
	
	public void frear() {
		if(velocidadeAtual > 0) {
			velocidadeAtual = velocidadeAtual -5;
		}
	}
}

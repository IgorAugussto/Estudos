package desafios;

public class Jogador {
	
	public int posicaoX;
	public int posicaoY;
	public int vida = 100;
	
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(posicaoX - oponente.posicaoX);
		int deltaY = Math.abs(posicaoY - oponente.posicaoY);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			System.out.println("NÃO HOUVE ATAQUE!");
			return false;
		}
	}
	
	public boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			posicaoY++;
			break;
		case LESTE:
			posicaoX++;
			break;
		case SUL:
			posicaoY--;
			break;
		case OESTE:
			posicaoX--;
			break;
		}
		
	return true;		
	}
}

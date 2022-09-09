package desafios;

public class Heroi extends Jogador {
	//Foi sobrescrito o método atacar para poder ter maior controle do ataque do heroi para o heroi tenha mais vantagem
	
	@Override
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(posicaoX - oponente.posicaoX);
		int deltaY = Math.abs(posicaoY - oponente.posicaoY);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 20;
			return true;
		} else {
			System.out.println("NÃO HOUVE ATAQUE!");
			return false;
		}
	}
}

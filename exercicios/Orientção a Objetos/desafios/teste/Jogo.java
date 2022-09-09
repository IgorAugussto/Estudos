package desafios.teste;

import desafios.Direcao;
import desafios.Heroi;
import desafios.Jogador;
import desafios.Monstro;

public class Jogo {
	public static void main(String[] args) {
		//Movimentação de um personagem de um jogo em um plano cartesiano usando Enum
		//Caso o Heori ou o Monstro mude de posiçãop e fique longe um do outro, não vai ocorre o ataque
		
		Jogador heroi = new Heroi();
//		heroi.posicaoX = 10;
//		heroi.posicaoY = 10;
		
		Jogador monstro = new Monstro();
//		monstro.posicaoX = 10;
//		monstro.posicaoY = 11;
		
		System.out.printf("Vida inicial do Herói: %d", heroi.vida);
		System.out.printf("\nVida inicial do Monstro: %d", monstro.vida);
		
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.LESTE);
		heroi.andar(Direcao.LESTE);
		
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.LESTE);
		monstro.andar(Direcao.LESTE);
		
		System.out.printf("\nPosição do Herói >>> %d ", heroi.posicaoX);
		System.out.printf("\nPosição do Herói >>> %d ", heroi.posicaoY);
		System.out.printf("\nPosição do Monstro >>> %d ", monstro.posicaoX);
		System.out.printf("\nPosição do Monstro >>> %d ", monstro.posicaoY);
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		
		System.out.println("\n*****  HOUVE UM COMBATE   *****");
		System.out.printf("Vida Herói: %d", heroi.vida);
		System.out.printf("\nVida Monstro: %d", monstro.vida);
	}
}
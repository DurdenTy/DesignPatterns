package Frete;

import strategies.Dano;
	
	

public class Player {
		Dano dano;
	
		protected double vida = 100;
	
		
		public void receberDano(Player p) {
			
			this.vida -= p.dano.infligirDano();
			System.out.printf("Recebeu %.0f de dano, sua vida atual é %.0f\n", dano.infligirDano(), this.vida);
			
		}
		
		public void atirar(Player p) {
			p.vida -= dano.infligirDano();
			System.out.printf("Você infligiu %.0f de dano, vida do oponente %.0f\n", dano.infligirDano(), p.vida);
		}
		
		public void setArma(Dano d) {
			dano = d;
		}
		
		
}

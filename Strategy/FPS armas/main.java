package Frete;

import strategies.Dano;
import strategies.Pistol;
import strategies.Shotgun;

public class main {

	public static void main(String[] args) {
		
		
		NovoPlayer p1 = new NovoPlayer();
		NovoPlayer2 p2 = new NovoPlayer2();
		
		p1.atirar(p2);
		p2.setArma(new Pistol());
		p2.atirar(p1);
		
		
	}

}

package Frete;

import strategies.Facade;
import strategies.Observer;

public class main {

	public static void main(String[] args) {
		
		Pattern p = new Pattern();
		
		p.getPattern();
		p.setPattern(new Observer());
		p.getPattern();
		p.setPattern(new Facade());
		p.getPattern();
		
	}

}

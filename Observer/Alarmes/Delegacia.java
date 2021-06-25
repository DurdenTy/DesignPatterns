package Frete;

import Observer.DisplayElement;
import Observer.Observable;
import Observer.Observer;

public class Delegacia implements Observer, DisplayElement {

	private String notificacoes;
	private Observable o;
	
	public Delegacia(Observable o) {
		this.o = o;
		o.registerElement(this);
	}
	
	
	@Override
	public void update(String o) {
		this.notificacoes = o;
		display();
	}
	
	@Override
	public void display() {
		System.out.printf("Status do alarme: %s\n", notificacoes);
	}

}

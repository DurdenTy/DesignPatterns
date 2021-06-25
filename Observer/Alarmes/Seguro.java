package Frete;

import Observer.DisplayElement;
import Observer.Observable;
import Observer.Observer;

public class Seguro implements Observer, DisplayElement {

	private String notificacao;
	private Observable o;
	
	public Seguro(Observable o) {
		this.o = o;
		o.registerElement(this);
	}
	
	@Override
	public void display() {
		
		System.out.printf("Status do seguro: %s\n", notificacao);
	}

	@Override
	public void update(String o) {
		this.notificacao = o;
		display();
	}

	
	
}

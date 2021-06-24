package Frete;

import Observer.DisplayElemento;
import Observer.Observer;
import Observer.Sujeito;

public class Tela implements Observer, DisplayElemento {
	
	private double temperatura, humidade, pressao;
	private Sujeito s;
	
	public Tela(Sujeito s) {
		this.s = s;
		s.registrarObserver((Observer)this);
	}
	
	public void update(double temp, double humi, double press) {
		this.temperatura = temp;
		this.humidade = humi;
		this.pressao = press;
		display();
	}
	
	public void display() {
		System.out.printf("Condições atuais\n Temperatura: %.0f C\n Humidade: %.0f%%\n Pressão: %.0f\n", this.temperatura, this.humidade, this.pressao);
	}
}

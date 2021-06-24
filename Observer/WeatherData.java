package Frete;

import java.util.ArrayList;

import Observer.Observer;
import Observer.Sujeito;

public class WeatherData implements Sujeito {

	private double temperatura, humidade, pressao;
	private ArrayList observers;
	
	public WeatherData() {
		observers = new ArrayList();
	}
	
	public void registrarObserver(Observer o) {
		observers.add(o);
	}
	
	public void removerObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
		
	}
	
	public void notificarObserver() {
		for(int i = 0; i < observers.size(); i++) {
			
			Observer observer = (Observer)observers.get(i);
			observer.update(temperatura, humidade, pressao);
			
		}
	}
	
	public void modificacoesFeitas(){
		notificarObserver();
	}
	
	public void setModificacoes(double t, double h, double p) {
		this.temperatura = t;
		this.humidade = h;
		this.pressao = p;
		modificacoesFeitas();
	}
	
}


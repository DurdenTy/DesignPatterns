package Frete;

import java.util.ArrayList;

import Observer.Observable;
import Observer.Observer;

public class Sensor3 implements Observable {
	private String st3 = "Seguro";
	private ArrayList<Observer> observers = new ArrayList();
	
	
	@Override
	public void registerElement(Observer o) {
		observers.add(o);
		
	}
	@Override
	public void removeElement(Observer o) {
		int index = observers.indexOf(o);
		
	}
	@Override
	public void notifyElement() {
		for(int i = 0; i < observers.size(); i++) {
			observers.get(i).update(st3);
		}
		
	}
	
	public void statusChanged() {
		notifyElement();
	}
	
	public void setStatus(String s) {
		this.st3 = s;
		statusChanged();
	}
	
}

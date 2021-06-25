package Frete;

import java.util.ArrayList;

import Observer.Observable;
import Observer.Observer;

public class Sensor2 implements Observable {

	private String st2 = "Seguro";
	private ArrayList<Observer> observers = new ArrayList();
	
	@Override
	public void registerElement(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeElement(Observer o) {
		int index = observers.indexOf(o);
		if(index >= 0) {
			observers.remove(index);
		}
		
	}

	@Override
	public void notifyElement() {
		for(int i = 0; i < observers.size(); i++) {
			observers.get(i).update(st2);
		}
		
	}
	
	public void statusChanged() {
		notifyElement();
	}

	public void setStatus(String s) {
		this.st2 = s;
		statusChanged();
	}
}

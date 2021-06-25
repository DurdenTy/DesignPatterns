package Frete;

import java.util.ArrayList;

import Observer.Observable;
import Observer.Observer;

public class Sensor implements Observable {

	private String status = "Seguro";
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
			observers.get(i).update(status);
		}
	}
	
	public void statusChanged() {
		notifyElement();
	}
	
	public void setStatus(String s) {
		this.status = s;
		statusChanged();
	}

}

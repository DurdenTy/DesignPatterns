package Frete;

import java.util.*;

import Observer.DisplayElement;
import Observer.Observable;
import Observer.Observer;

public class Alarme implements Observable, Observer, DisplayElement {
	
	private String sensores = "Seguro";
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
	public void notifyElement() {
		for(int i = 0; i < observers.size(); i ++) {
			observers.get(i).update(sensores);
		}
	}
	
	public void sensorModificado() {
		notifyElement();
	}
	
	public void setStatus(String status) {
		this.sensores = status;
		sensorModificado();
	}
	
	public void update(String o) {
		this.sensores = o;
		sensorModificado();
	}
	
	public void display() {
		System.out.printf("Status: %s\n", sensores);
	}
	
	
}

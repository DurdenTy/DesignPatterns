package Frete;

import strategies.Ram;

public class Pc implements Ram {

	Ram ram;
	
	public double getCapacidade() {
		return ram.getCapacidade();
	}
	
	public void setCapacidade(Ram ram) {
		this.ram = ram;
	}
	
}

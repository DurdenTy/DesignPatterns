package Decorator;

public class Expresso extends Bebida {

	public Expresso() {
		descricao = "Espresso ";
	}
	
	@Override
	public double cost() {
		return 17.00;
	}

	
}

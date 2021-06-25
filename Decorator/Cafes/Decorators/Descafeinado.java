package Decorator;

public class Descafeinado extends Bebida {

	public Descafeinado() {
		descricao = "Descafeinado";
	}
	@Override
	public double cost() {
		return 15;
	}
	
}

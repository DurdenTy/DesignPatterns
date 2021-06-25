package Decorator;

public class Chocolate extends CondimentoDecorator {

	Bebida bebida;
	
	public Chocolate(Bebida b) {
		this.bebida = b;
	}
	
	@Override
	public String getDescricao() {
		return descricao = "Chocolate";
	}
	
	@Override
	public double cost() {
		return bebida.cost() + 9;
	}
	
}

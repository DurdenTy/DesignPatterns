package Decorator;

public class Mocha extends CondimentoDecorator {

	private Bebida bebida;
	
	public Mocha(Bebida b) {
		this.bebida = b;
	}
	
	@Override
	public String getDescricao() {
		
		return bebida.getDescricao() + ", Mocha";
	}

	@Override
	public double cost() {
		return bebida.cost() + 10;
	}

}

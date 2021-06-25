package Decorator;

public class Leite extends CondimentoDecorator {

	Bebida bebida;
	
	public Leite(Bebida b) {
		this.bebida = b;
	}
	
	public String getDescricao() {
		return descricao = "Leite ";
	}
	
	public double cost() {
		return bebida.cost() + 5;
	}
}

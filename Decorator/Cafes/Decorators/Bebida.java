package Decorator;

public abstract class Bebida {

	protected String descricao = "Bebida desconhecida";
	
	public String getDescricao() {
		return descricao;
	}
	
	public abstract double cost();
	
}

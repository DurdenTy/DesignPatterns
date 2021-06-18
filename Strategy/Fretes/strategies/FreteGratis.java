package Frete;

public class FreteGratis implements PrecoDoFrete {

	protected double valorFrete; 
	
	public double calculoDoFrete() {
		
		return this.valorFrete *= 0;
		
	}
	
}

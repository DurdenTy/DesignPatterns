package Frete;

public class FreteExpresso implements PrecoDoFrete {

	protected double valorDoFrete = 40;
	
	public double calculoDoFrete() {
		
		return this.valorDoFrete *= 1.03;
		
	}
	
}

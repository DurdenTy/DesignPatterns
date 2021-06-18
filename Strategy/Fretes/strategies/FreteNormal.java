package Frete;

public class FreteNormal implements PrecoDoFrete {

	protected double valorDoFrete = 20;
	
	public double calculoDoFrete() {
		
		return this.valorDoFrete *= 1.03;
		
	}
	
}

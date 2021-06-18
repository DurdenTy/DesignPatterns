package Frete;

public class ContratanteDoServico {

	PrecoDoFrete pf;
	
	public ContratanteDoServico(PrecoDoFrete s, double d) {
		
		this.valorFinal(s, d);
		
	}
	
	public double valorFinal(PrecoDoFrete pdf, double v) {
		
		pf = pdf;
		System.out.printf("Valor final a pagar é: R$%.2f", pf.calculoDoFrete() + v);
		return pf.calculoDoFrete() + v;
		
	}
	
}

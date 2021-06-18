package Frete;

public class main {

	public static void main(String[] args) {
		
		
		ContratanteDoServico cs = new ContratanteDoServico (new FreteExpresso(), 42);
		ContratanteDoServico cs2 = new ContratanteDoServico (new FreteNormal(), 42);
		ContratanteDoServico cs3 = new ContratanteDoServico (new FreteGratis(), 42);

	}

}

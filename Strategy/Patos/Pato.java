import strategies.ComportamentoSom;
import strategies.ComportamentoVoar;

public class Pato {
	
	protected ComportamentoSom csom;
	protected ComportamentoVoar cvoar;
	
	public void patoVoando() {
		
		cvoar.voar();
		
	}
	
	public void patoSom() {
		
		csom.som();
		
	}
	
	public void setSom(ComportamentoSom s) {
		csom = s;
	}
	
	public void setVoar(ComportamentoVoar v) {
		cvoar = v;
	}

}

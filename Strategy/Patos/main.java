import strategies.NaoVoa;
import strategies.SemSom;

public class main {

	public static void main(String[] args) {
		
		PatoAzul p = new PatoAzul();
		
		p.setSom(new SemSom());
		p.setVoar(new NaoVoa());
		
		p.patoVoando();
		p.patoSom();

	}

}

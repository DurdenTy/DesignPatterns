
public class main {

	public static void main(String[] args) {
		
		Sensor s = new Sensor();
		Sensor2 s2 = new Sensor2();
		Sensor3 s3 = new Sensor3();
		Alarme a = new Alarme();
		Delegacia d = new Delegacia(a);
		Seguro se = new Seguro(a);
		s.registerElement(a);
		s2.registerElement(a);
		s3.registerElement(a);
		s.setStatus("Fogo");
		s2.setStatus("Enchente");
		s3.setStatus("Invasão de coelhos");
	}

}

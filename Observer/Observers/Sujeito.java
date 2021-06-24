package Observer;

public interface Sujeito {

	public void registrarObserver(Observer o);
	public void removerObserver(Observer o);
	public void notificarObserver();
	
}

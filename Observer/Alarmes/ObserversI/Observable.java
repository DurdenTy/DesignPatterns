package Observer;

public interface Observable {
	public void registerElement(Observer o);
	public void removeElement(Observer o);
	public void notifyElement();
}

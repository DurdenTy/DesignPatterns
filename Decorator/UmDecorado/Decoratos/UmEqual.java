package Decorator;

public class UmEqual extends UmDecorator {

	UmBase ub;
	
	public UmEqual(UmBase u) {
		this.ub = u;
	}
	
	public String getDescricao() {
		return ub.getDescricao() + " equals";
	}
	
	public String enfeitar() {
		return "=" + ub.enfeitar() + "=";
	}
	
}

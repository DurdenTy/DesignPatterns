package Decorator;

public class UmChaves extends UmDecorator {

	UmBase ub;
	
	public UmChaves(UmBase u) {
		this.ub = u;
	}
	
	public String getDescricao() {
		return ub.getDescricao() + " Chaves";
	}
	
	public String enfeitar() {
		return "{" + ub.enfeitar() + "}";
	}
	
	
	
}

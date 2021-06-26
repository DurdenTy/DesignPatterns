package Decorator;

public class UmColchetes extends UmDecorator {

	UmBase ub;
	
	public UmColchetes(UmBase u) {
		this.ub = u;
	}
	
	public String getDescricao() {
		return ub.descricao + " colchetes";
	}
	
	public String enfeitar() {
		return "(" + ub.enfeitar() + ")";
	}

	
	
}

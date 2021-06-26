package Decorator;

public class UmBrackets extends UmDecorator {

	UmBase ub;
	
	public UmBrackets(UmBase u) {
		this.ub = u;
	}
	
	public String getDescricao() {
		return ub.getDescricao() + " Brackets";
	}
	
	public String enfeitar() {
		return "[" + ub.enfeitar() + "]";
	}
	
}

import Decorator.*;


public class main {

	public static void main(String[] args) {
		
		UmBase u = new Um();
		UmBase u2 = new UmColchetes(u);
		UmBase u3 = new UmBrackets(u2);
 		UmBase u4 = new UmChaves(u3);
 		UmBase u5 = new UmEqual(u4);
		System.out.println(u5.enfeitar());
		
	}

}

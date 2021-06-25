package Frete;

import Decorator.Bebida;
import Decorator.Chocolate;
import Decorator.CondimentoDecorator;
import Decorator.Descafeinado;
import Decorator.Expresso;
import Decorator.Leite;
import Decorator.Mocha;

public class main {

	public static void main(String[] args) {
		
		Bebida b = new Descafeinado();
		Bebida b2 = new Expresso();
		Bebida b3 = new Mocha(b);
		System.out.println(b3.getDescricao());
		
	}

}

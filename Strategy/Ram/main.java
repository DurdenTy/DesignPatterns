package Frete;

import javax.swing.*;
import javax.swing.border.Border;

import strategies._4Gb;
import strategies._8Gb;

import java.awt.color.*;

public class main {

	public static void main(String[] args) {
		
		Pc2 pc2 = new Pc2();
		pc2.setCapacidade(new 8Gb());
		System.out.println(pc2.getCapacidade() + " Gb");
		
	}

}

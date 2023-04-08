package org.bike;

public class Ktm extends Bike {
	@ Override
	public void cost() {
		System.out.println("2000000");
		super.cost();
	}
	@ Override
	public void speed() {
		System.out.println("220");
		super.speed();
	}
	public static void main(String[] args) {
		Ktm s=new Ktm();
		s.cost();
		s.speed();
	}

}

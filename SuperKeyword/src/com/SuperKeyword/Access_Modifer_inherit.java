package com.SuperKeyword;


class Acces_modi {
	protected static void m1() {
		System.out.println("A() m1");
	}
}

class Acces_modi2 extends Acces_modi{
	public static void m1() {
		System.out.println("B m1()");
	}
}
public class Access_Modifer_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acces_modi2 a = new Acces_modi2();
		a.m1();

	}

}

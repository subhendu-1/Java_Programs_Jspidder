package com.SuperKeyword;

class A{
	int i = 10;
	static int j = 30;
	
}

class B extends A{
	int i = 20;
	
	void m3() {
		System.out.println(i);
		System.out.println(j);
		System.out.println("B m3()");
	}
}

class C extends B{
	int i = 40;
	//int j = 50;
	
	void m4() {
		super.m3();
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(super.i);
		System.out.println(super.j);
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.m4();
	}

}

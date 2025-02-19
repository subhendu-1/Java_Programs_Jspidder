package com.SingaleToneClass;

public class DrivedA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = A.getInstance();
		A a2 = A.getInstance();
		A a3 = A.getInstance();
		
		System.out.println(a1.i);
		a1.i -= 10;
		System.out.println(a2.i);
		a2.i -= 20;
		System.out.println(a3.i);
	}

}

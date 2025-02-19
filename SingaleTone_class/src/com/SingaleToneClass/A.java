package com.SingaleToneClass;

public class A {
	static A a = null;
	int i = 50;
	 A() {
		
	}
	
	
	public static A getInstance () {
		if(a == null) {
			a = new A();
			return a;
		}
		else {
			return a;
		}
	}
}

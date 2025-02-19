package com.FactoryPattern;

public class FectoryMethod {
	public static class A{
		String name ="Subhendu";
		int age =20;
		
	
		public static A m1() {
			A a = new A();
			return a;
		}
		public void Display() {
			System.out.println(name);
			System.out.println(age);
		}
	}

	public static void main(String[] args) {
		A a1 = A.m1();
		A a2 = A.m1();
		

	}

}

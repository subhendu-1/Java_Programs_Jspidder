package com.SuperKeyword;
class AA {
	int i = 10;
	static int j = 20;
	
	void m1() {
		System.out.println("This is AA m1()");
	}
	
	static void m2() {
		System.out.println("This is a AA m2()");
	}
}

class BB extends AA {
	//int i = 20;
	void m3() {
		System.out.println("This is a BB m3()");
	}
}


class CC extends BB{
	int i = 20;
	void m4() {
		System.out.println(i)
		System.out.println("This is CC m4()")
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b = new BB();
		
		System.out.println(b.i);
		System.out.println(b.j);
		
		b.m1();
		b.m2();
		b.m3();
	


	}

}

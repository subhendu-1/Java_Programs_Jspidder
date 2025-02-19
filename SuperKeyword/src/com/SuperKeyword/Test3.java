package com.SuperKeyword;
class AAA {
	AAA(){
		System.out.println("This is AA method constractor");
	}
	
	
}

class BBB extends AAA {
	BBB(){
		System.out.println("This is BB method constractor");
	}
}

class CCC extends BBB{
	CCC(){
		System.out.println("This is CC method constractor");
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CCC();

	}

}

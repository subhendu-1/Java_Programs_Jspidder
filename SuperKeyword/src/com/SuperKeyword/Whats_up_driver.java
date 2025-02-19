package com.SuperKeyword;

//Constructor Chain : Calling one constructor to another constructor is called constractor chaining using this and super key words
class whats_up_1{
	void sent() {
		System.out.println("Single Tick");
	}
}

class whats_up_2 extends whats_up_1{
	void sent() {
		System.out.println("Doublle Click");
	}
	
	void message() {
		System.out.println("Voice message");
	}
}

class whats_up_3 extends whats_up_2{
	void sent () {
		System.out.println("Double Blue tick");
	}
	
	void video() {
		System.out.println("Video call");
	}
}

class whats_up_4 extends whats_up_3{
//	void video() {
//		System.out.println("HD Video call");
//	}
}
public class Whats_up_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		whats_up_4 w = new whats_up_4();
		
		w.video();
		w.message();
		w.sent();

	}

}

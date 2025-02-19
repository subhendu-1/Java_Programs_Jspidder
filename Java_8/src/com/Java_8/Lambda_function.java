package com.Java_8;


@FunctionalInterface
interface I1{
	int add(int a,int b);
}

interface I2{
	boolean isEven(int n);
}

class Addition implements I1{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
public class Lambda_function {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Addition a = new Addition();
//		int ans = a.add(12, 10);
//		System.out.println(ans);
		
//		Lambda Fucntion
		
		I1 i = (a,b) -> a+b;
		
		System.out.println(i.add(10, 20));
		System.out.println(i.add(20, 30));
		
		
//		Check the number is even or not using lambda function
		
		I2 j = (a) -> a%2==0;
		
		System.out.println(j.isEven(20));
		System.out.println(j.isEven(15));
	
	}

}

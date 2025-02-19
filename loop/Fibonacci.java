import java.util.*;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		// first we take to varialbe 
		int n = 5;
		int a = 0;
		int b = 1,c;
		int i = 1;
		while(i <= n){
			System.out.println(a);
		    c = a+b;
			a = b;
			b = c;
			i++;
		}
		System.out.println("Hello World!");
	}
}

import java.util.*;

class Fibonacci 
{
	public static int fib(int n){
		int a = 0;
		int b = 1;
		int c =0;
		for(int i = 1; i <= n-1; i++){
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	public static void main(String[] args) 
	{
		int n = 5;
		int ans = Fibonacci.fib(n);

		System.out.println(ans);
	}
}

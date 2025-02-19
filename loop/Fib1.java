class Fib1 
{
	public static void main(String[] args) 
	{
		// first we take to varialbe 
		//int n = 50;
		int lower = 5;
		int upper = 10;
		int a = 0,b = 1, c;
		//int i = 1;
		while(lower<= upper){
			if(a>1){
			System.out.println(a);
			}
		    c = a+b;
			a = b;
			b = c;
			lower++;
		}
		System.out.println("Hello World!");
	}
}

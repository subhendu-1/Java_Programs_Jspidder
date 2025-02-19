class Decriment 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 30;
		System.out.println('a'+ '='  + a);
		System.out.println("a = " + a);
		System.out.println("Hello World!");
		System.out.println("a = " + a + "\n" + "b = " + b);
		
		a++;
		System.out.println(a);
		int c = ++ a;
		a = a++;  
		a++;

		System.out.println(a);
		System.out.println(c);
		System.out.println(a);
//Examele 1
		int x = 0;
		//x = x++ // Here before assiging the value is increses but for post increment value is use after increment is happen 
		System.out.println(++x);
		System.out.println(x);
		int y = 0;
		System.out.println(y++);
		System.out.println(y);
// Example 2
		int z = 0;
		z = ++z;
		System.out.println(z);

		z  = ++z;
		System.out.println(z);

		z  = z++;
		System.out.println(z);

		z  = z++;
		System.out.println(z);
	}
}


/*class A
{
	Decriment d1 = new Decriment;
	//d1.a = 20;   // local variable you don't access this 
	System.out.println(d1.a);
}
*/
class I 
{
	static int b = 20;
	static int a = 10;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		J.m2();
		Z.main();
	}
}



class J
{
	public static void m2(){
		System.out.println(I.a);
		I.a = 25;
		System.out.println(I.a);
		I.a = 6+3;

		System.out.println(I.a);

		System.out.println(I.b);
	}
}

class Z
{
	public static void main(){
		I.a = 10;
		System.out.println(I.a);
		I.a = 30;
		System.out.println(I.a);
		I.a = 6+4;
		System.out.println(I.a);

		System.out.println(I.b);
	}
}

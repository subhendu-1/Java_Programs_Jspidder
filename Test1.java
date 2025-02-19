
// Here how to use another class instance variable in another class this is the process



class Test1 
{
	public static void main(String[] args) 

	{
		B b = new B();
		b.i = 10;
		b.j = 20;
		b.k = 30;


		B b1 = new B();

		System.out.println(b.i);
		System.out.println(b.j);
		System.out.println(b.k);


		System.out.println(b1.i);
		System.out.println(b1.j);
		System.out.println(b1.k);

		System.out.println(B.a);
		//System.out.println("Hello World!");

	}
}

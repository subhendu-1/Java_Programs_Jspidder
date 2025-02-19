
//






class  M
{
	int a;
	int b;
	String str = "Subhendu";
	public static void main(String[] args) 
	{
		//Another way to declear
		//M a1,a2;
		//int a1 = new M();  here java is understand just as a variable not an address of the instance variable that why this give dereferancing error
		M a1 = new M();  // Object of address of M type
		a1.a = 10;
		
		M a2 = new M();
		a2.str = "Rajat";
		
		
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.str);
		System.out.println(a2.str);
		System.out.println(a2.a);

	}
}

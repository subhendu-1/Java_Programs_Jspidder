class A 
{
	public static void main(String[] args) 
	{
		int i = 0;
		for (System.out.println("This is a statement"),i = 1;i < 5 ;i++ )  // here we can call the method in statement mean i we write this this not a problem
		{
			System.out.println(i + "Subhendu Adak");
		}
		System.out.println("the value of i is " + i);

     // what is print 
		int a = 1;
		for (System.out.println("a"); a <= 3 ;System.out.println("b") )
		{
			System.out.println("c");
			a++;
		}

		int j;
		for( i = 1; i <= 20; i = i+2){   // here i is still 1 not 3 because we not assign the value // this compile time error
			System.out.println(i);
		}


		int b ;
		for( b = 1; b < 4; b++);
		System.out.println(b);
		System.out.println(b);
		System.out.println(b);
	}
}

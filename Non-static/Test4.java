
//through reference we can acess

//java also support using reference for static variable through class name or created object reference
class C
{
	int i;   //when you created object how many time i memory will be created
	static int j=35;  // this static variable only one memory will be created 
}

class  Test4
{
	public static void main(String[] args) 
	{
		C c1 = new C(); 
		C c2 = new C();

		c1.i = 10;
		c2.j = 20;


		System.out.println(c1.i);
		System.out.println(c2.j);



//java also support using reference for static variable through class name or created object reference
		System.out.println(c1.j);
		System.out.println(c2.j);
	}
}

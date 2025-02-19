class G 
{
	static int i = 10;  //static var = any method you can acess in any point of time.
	public static void main(String[] args) 
	{
		
		System.out.println(G.i);  // acess this variable class_name.reference  10
		G.m1();   // 10
		G.i = 20;    // 20
		System.out.println(G.i);
		G.m1(); // 10 X  20 is right  in java when static variable is updated in globaly
	}

	public static void m1(){
		System.out.println("m1 start");
		System.out.println(G.i);
	}
}

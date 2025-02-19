package block_Project;

public class Non_Static_Block {
	static int j;
	int i;
	static {
		System.out.println("static-Block-1");
		Non_Static_Block a = new Non_Static_Block();
	}
	
    {
    	System.out.println("Non-static-Block-1");
    	i = 10;
    	j = 20;// static variable are initialized in non-static block
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		Non_Static_Block a = new Non_Static_Block();// non-static block are execute for every object creation
		System.out.println(j);
		System.out.println(a.i);
		System.out.println("Main end");


	}
	
	{
		System.out.println("Non-static-Block-2");
		
	}
	static {
		System.out.println("static-Block-2");
	}
	
	static {
		System.out.println("static-Block-3");
	}
}

package block_Project;

public class Static_Block {
	int i ;
	static int j;
	static {
		System.out.println("Static-Block-1");// Here this static block is print first before main method because static blok is execute in class loading time
		//i= 10; //in static block we can't initialized non-static variable
		j = 10; // static block we can initialized only static variable
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Manin start");
		Static_Block sc = new Static_Block();
		System.out.println(sc.i);
		System.out.println(j);

		System.out.println("Manin end");

	}
	
	static {
		System.out.println("Static-Block-2");
	}

}

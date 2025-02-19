class C 
{
	public static void main(String[] args) 
	{
		System.out.println("Main start");
		C.m3();
		System.out.println("Main end");
	}

	public static void m3(){
		System.out.println("M1 start");
		C.m4();
		System.out.println("M1 end");
	}

	public static void m4(){
		System.out.println("Maistart");
		System.out.println("Mai end");
	}
}

class  VarArgs
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m1(2,3,4);
		m1(2,3);
	}

	static void m1(int... a){
		for(int e : a){
			System.out.print(" " + e);
		}
		System.out.println();
	}
}

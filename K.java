
// When we dont write class name and access this variable this is first check localy if it is not find it is error.
// But if you use class name with this is first check localy if it is not present then this is check globaly under class it is present or not 




class K 
{
	static int i = 10;
	public static void main(String[] args) 
	{



		System.out.println(i);  //Refers current class static var
		int i = 20;
		System.out.println(i);  //Refers Local var
		System.out.println(K.i);  // Refers K class static var

	}
}

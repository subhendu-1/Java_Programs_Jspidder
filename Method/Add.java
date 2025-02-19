class Add 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(add(2,5,7,7));
		System.out.println(add(2,5,7,34,300,7));
	}

	static int add(int... nums){
		int sum = 0;
		for(int n:nums){
			sum += n;
		}
		return sum;
}
}

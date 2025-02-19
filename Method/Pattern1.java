class Pattern1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int n = 5;
		int stars = 1,space = n-1;
		
		for(int i = 1; i <= n; i++){
			printSpaces(space);
			printStars(stars);
			System.out.println();

			space--;
			stars += 2;
		}

	}

	

	static void printStars(int n){
		for(int i = 1; i <= n; i++){
			System.out.print("*");
		}
	}

	static void printSpaces(int n){
		for(int i = 1; i <= n; i++){
			System.out.print(" ");
		}
	}
}

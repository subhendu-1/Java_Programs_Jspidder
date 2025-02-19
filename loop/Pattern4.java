class Pattern4 
{
	public static void main(String[] args) 
	{
		int n = 5;

		for(int i = n; i > 0; i--){
			for(int j = 0; j < i-1; j++){
				System.out.print(" ");
			}
			//for(int k = n -i; k < n; k++){
				System.out.println("*");
			//}
			
		}
		System.out.println("Hello World!");
	}
}

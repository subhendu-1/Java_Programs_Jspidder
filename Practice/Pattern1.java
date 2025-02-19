class Pattern1

{
	public static void main(String[] args) 
	{
		int n = 5;
		int x = 0,y;
		for(int i = 1; i <= n; i++){
			y = x + i;
			x = y;
			for(int j = 1; j <= i; j++){
				System.out.print(y + "\t");
				y--;
			}
			System.out.println();
		}




		int l = 0,k = 0;
		for(int i = 1; i <= n; i++){
		   if(i%2 != 0){
			for(int j = 1; j <= n; j++){
				l++;
				System.out.print(l + "\t");
				
			}
		   }
		   else{
			   k = l + n;
			   l = k;
			   for(int j = 1; j <= n; j++){
				   System.out.print(k + "\t");
				   k--;
			   }
			
		   }
			System.out.println();
		}
		System.out.println("Hello World!");
	}
}

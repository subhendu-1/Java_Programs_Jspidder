class Pattern7 
{
	public static void main(String[] args) 
	{
		int n = 5;
		/*for(int i = 1; i <= n; i++){
			if(n%2 != 0){
				int x = (i-1) * n + 1;
				for(int j = 1; j <= n; j++){
					System.out.print(x + "\t");
					x++;
				}
			}else{
				int y = i * n;
				for(int j = 1; j <= n; j++){
					System.out.print(y + "\t");
					y--;
				}
			}
			System.out.println();
		}

		*/







		System.out.println("Hello World!");




		int x = 1,y = 0;
		/*for(int i = 1; i <= n; i++){
			if(n%2 != 0){
				//int x = (i-1) * n + 1;
				for(int j = 1; j <= n; j++){
					System.out.print(x + "\t");
					x++;
				}
			}else{
				y = x + (n-1);
				x = y+1;
				for(int j = 1; j <= n; j++){
					System.out.print(y + "\t");
					y--;
				}
			}
			System.out.println();
		}

		*/







		for(int i = 1; i <= n; i++){
			if(n%2 != 0){
				//int x = (i-1) * n + 1;
				for(int j = 1; j <= i; j++){
					System.out.print(x + "\t");
					x++;
				}
			}else{
				y = x + (i-1); 
				x = y+1;
				for(int j = 1; j <= i; j++){
					System.out.print(y + "\t");
					y--;
				}
			}
			System.out.println();
		}




	}
}

import java.util.*;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		for(int i = n; i <= m; i++){
			boolean flag = true;
			for(int j = 2; j < i/2; j++){
				if(i%j == 0){
					flag = false;
					//System.out.println("This is not a prime number");
					break;
				}
			}
			if(flag){
				System.out.println(i);
			}
			
		}
		//System.out.println("Hello World!");
	}
}

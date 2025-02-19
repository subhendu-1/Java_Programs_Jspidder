import java.util.*;

class FindPrmeRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter Two number");
		int n = sc.nextInt();
		int m = sc.nextInt();

		for(int i = n; i <= m; i++){
			if(Method1.IsPrime(i)) System.out.println(i);
			//else System.out.println("This is not a prime number");
		}
	}
}
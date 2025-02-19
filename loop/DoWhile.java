import java.util.*;
class DoWhile 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int n = 10;
		int sum = 0;

		// Here we use do while because first time we want to add the number
		do
		{
			while(n>0){
				sum += n%10;
				n /= 10;
			}
			n = sum;
		}
		while (n>9);
		System.out.println(n);
	}
}

import java.util.*;
class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (n>0)
		{
			int digit = n%10;
			if(digit % 2 == 0){
			sum += (n%10);
			}
			n = n/10;
		}
		System.out.println(sum);
	}
}

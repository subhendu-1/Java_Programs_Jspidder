import java.util.*;

class Strong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int k = n; k <= m; k++){
		int temp = k;
		int sum = 0;

		while(temp>0){
			int digit = temp%10;
			int add = 1;
			for(int i = digit; i > 0; i--){
				add *= i;
			}
			sum += add;
			temp /=10;
		}
		
		if(sum == k){
			System.out.println(k);
		}
		}
	}
}

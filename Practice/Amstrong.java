import java.util.*;
class Amstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int len = 0; 
		while(n>0){
			int digit = n%10;
			len++;
			n /=10;
			
		}

		n = temp;
		int sum = 0;

		for(int i = n; i > 0; i /= 10){
			int digit = i % 10;
			int powr = 1;
			for(int j = 0; j < len; j++){
				powr *=digit;
				
			}
			sum += powr;
			System.out.println(sum);
			
		}
		

		if(temp == sum){
			System.out.println("This is Amstrong");
		}else{
			System.out.println("This is not Amstrong");
		}

		System.out.println(sum);
	}
}

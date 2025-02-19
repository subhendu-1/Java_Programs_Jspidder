import java.util.*;
class ArmstrongRange 
{
	public static boolean Armstrong(int n){
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
			
			
		}
		
		return temp == sum;

	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number");
		int n = sc.nextInt();
		System.out.println("Enter end number");
		int m = sc.nextInt();

		for(int i = n; i <= m; i++){
			if(Armstrong(i)){
				System.out.println(i);
			}
		}
		

		
	}
}

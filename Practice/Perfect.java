import java.util.*;
class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number ");
		int num = sc.nextInt();

		int sum = 0;
		for(int i = 1; i < num; i++){
			if(num%i==0){
				sum += i;
			}
		}

		if(sum == num){
			System.out.println("This is ");
		}
	}
}

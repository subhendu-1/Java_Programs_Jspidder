import java.util.*;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your amount ");
		int num = sc.nextInt();
		
		if(num >= 2000){
			int b = num/2000;
			System.out.println("2000: " + b);
			num = num % 2000;
		}


		if(num >= 1000){
			int b = num/1000;
			System.out.println("1000: " + b);
			num = num % 1000;
		}


		if(num >= 500){
			int b = num/500;
			System.out.println("500: " + b);
			num = num % 500;
		}


		if(num >= 200){
			int b = num/200;
			System.out.println("200: " + b);
			num = num % 200;
		}

		if(num >= 100){
			int b = num/100;
			System.out.println("100: " + b);
			num = num % 100;
		}
	

		System.out.println("Hello World!");
	}
}

import java.util.Scanner;

class Currencycal 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int a = sc.nextInt();



		if(a >= 2000) {
			a = a/2000;
			a = a%2000;
			System.out.println(a);
		}

		if(a >= 1000){
			a = a/1000;
			a = a%1000;
			System.out.println(a);
		}

		if(a >= 500){
			a = a/500;
			a = a%500;
			System.out.println(a);
		}

			if(a >= 100){
			a = a/100;
			a = a%100;
			System.out.println(a);
		}
		System.out.println("Hello World!");
	}
}

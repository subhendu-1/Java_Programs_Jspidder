import java.util.Scanner;

class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int a = sc.nextInt();

		if ((a&1) == 0)
		{
			System.out.println("This is even number");
		}
		else {
			System.out.println("This is odd");
		}

	}
}

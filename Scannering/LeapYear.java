import java.util.*;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);


		System.out.println("Enter the year ");

		int b = a.nextInt();

		if((b%400) == 0){
			System.out.println("This is leap year");
		}

		else if((b%4) == 0 && (b%100) != 0){
			System.out.println("This is leap year");
		}

		else{
			System.out.println ("This is not a leap year");
		}


	}
}

import java.util.*;

class DayavalibalityMon 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month number ");
		int month = sc.nextInt();

		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 Day's");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 Day's");
				break;
			case 2:
				System.out.print("Enter year ");
				int year = sc.nextInt();

				if(year % 400 == 0  || (year % 4 == 0 && year % 100 != 0)){
					System.out.println("29 Day's");
					break;
				}else{
					System.out.println("28 Day's");
				}
				
		}
		System.out.println("Hello World!");
	}
}

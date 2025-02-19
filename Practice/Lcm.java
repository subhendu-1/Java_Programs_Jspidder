import java.util.*;
class Lcm 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int capital = n > m ? n : m;
		int step = capital;
		while(true){
			if(capital % n == 0 && capital % m == 0){
				System.out.println(capital);
				break;
			}
			capital += step;
		}

		System.out.println("Hello World!");

		Lcm.GCD();
	}

	public static void GCD(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int num = n < m ? n : m;

		while(true){
			if(n % num == 0 && m % num == 0){
				System.out.println(num);
				break;
			}
			num--;
		}
	}
}

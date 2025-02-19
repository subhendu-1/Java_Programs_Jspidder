
import java.util.*;
class Calcul
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		char cr = sc.next().charAt(0);

		switch(cr) {
			case  '+':
				System.out.println("adition of a and b is " + (a+b));
			case '-':
				System.out.println(a-b);
			case '/':
				System.out.println(a/b);
			case '*':
				System.out.println(a*b);

		}

		
		System.out.println("Hello World!");
	}
}



import java.util.*;
class B 
{
	public static void main(String[] args) 
	{
		Scanner a1 = new Scanner(System.in);

		int a = a1.nextInt();
		int b = a1.nextInt();
		

		int n = a>b ? a:b;
		//int step = n;

		while(true){
			if(n%a == 0 && n%b == 0){
				break;
			}
			n += n;
		}
		System.out.println("LCM of " + a +" and " + b + " = " + n);
	}
}

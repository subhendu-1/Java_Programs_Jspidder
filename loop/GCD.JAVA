import java.util.*;
class GCD 
{
	public static void main(String[] args) 
	{
		Scanner a1 = new Scanner(System.in);
		int a = a1.nextInt();
		int b = a1.nextInt();

		int n = a<b ? a:b;

		while(true){
			if(n%a == 0 && n%b == 0){
				break;
			}
			n--;
		}
		System.out.println("" + n);
	}
}

import java.util.*;
class PatternSum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = "";
		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum += i;
			if(i == num){
				str +=i;
				break;
			}
			str = str + i + "+";

		}
		System.out.println(str + "=" + sum);
	}
}

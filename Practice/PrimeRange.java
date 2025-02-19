import java.util.*;

class PrimeRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 1;
		for(int i = n; i < m; i++){
			if(i <= 1){
				continue;
			}
			if(i != 2 && i % 2 == 0){
				continue;
			}
			boolean flag = true;
			

			for(int j = 2; j < i/2; j++){
				if(i  % j == 0){
					flag = false;
					break;
				}
			}
			

			if(flag){
				count++;
				if(count%2== 0){
				System.out.println(i);
				}
			}
		}
		System.out.println("Hello World!");
	}
}

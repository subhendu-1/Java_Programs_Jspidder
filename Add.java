import java.util.Scanner;

class Add 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//int m = sc.nextInt();
		//int ans = add_num(n,m);
		//System.out.println(ans);
		String str = sc.nextLine();
		int ans1 = count(str);
		System.out.println(ans1);


		System.out.println("Hello World!" + "//s" + str);
	}

	static int add_num(int n,int m){
		int add = n + m;
		return add;
	}



	static int count(String str){
		int cnt = str.split("//s").length;
		return cnt;
	}
}

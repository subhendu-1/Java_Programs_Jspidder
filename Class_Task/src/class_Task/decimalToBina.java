package class_Task;

public class decimalToBina {
	public static int DecToBin(int n) {
		if(n == 0) return 0;
		else {
			return ((n%2) + 10 * DecToBin(n/2));
		}
	}
	
	public static int BinToDeci(int n,int p) {
		if(n == 0) return 0;
		int lastD = n%10;
		return lastD * (int)Math.pow(2, p) + BinToDeci(n/10,p+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DecToBin(13));
		System.out.println(BinToDeci(1101,0));
	}

}

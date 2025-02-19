package block_Project;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		if(n <= 1) return false;
		for(int i = 2; i < n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void alternetPrim(int s,int e) {
		int count = 0;
		for(int i = s; i <= e; i++) {
			if(isPrime(i)) {
				if(count % 2 == 0) {
					System.out.println(i);
				}
				
				count++;
			}
		}
	}
	
	public static void last_Three(int s,int e) {
		int count = 0;
		for(int i = e; i >= s; i--) {
			if(isPrime(i)) {
				System.out.println(i);
				count++;
			}
			
			if(count == 3 ) break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PrimeNumber.last_Three(2, 30);
		PrimeNumber.alternetPrim(1, 30);

	}

}

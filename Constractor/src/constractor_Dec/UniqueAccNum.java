package constractor_Dec;

public class UniqueAccNum {
	int AccNum ;
	static int n = 1000 ;
	
	public UniqueAccNum() {
		AccNum = n++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueAccNum a1 = new UniqueAccNum();
		UniqueAccNum a2 = new UniqueAccNum();
		UniqueAccNum a3 = new UniqueAccNum();
		
		System.out.println(a1.AccNum);	
		System.out.println(a2.AccNum);
		System.out.println(a3.AccNum);

	}

}

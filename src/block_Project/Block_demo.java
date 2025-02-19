package block_Project;



public class Block_demo {
	static int i;
	//i = 10 ;// this is give complie time error because in java not possible to static and non-static variable intializtion without static or non static varialble
	static {
		i = 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block_demo sc = new Block_demo();
		System.out.println(sc.i);
	}

}

package constractor_Dec;

public class Count_obj {
	static int count = 0;
	Count_obj() {
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Count_obj();
		new Count_obj();
		new Count_obj();
		System.out.println(Count_obj.count);
	}

}

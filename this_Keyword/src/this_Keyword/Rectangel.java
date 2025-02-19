package this_Keyword;

public class Rectangel {
	
	int len;
	int bre;
	
	public void Initia(int len,int bre) {
		this.len = len;
		this.bre = bre; // this key word reference or interference from current instance
	}
	
	public void RecArea() {
		System.out.println(len * bre);
	}
	
	public void RecPerimeter() {
		System.out.println(2*(len + bre));
	}
	
	public void Display() {
		System.out.println(len);
		System.out.println(bre);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangel sc = new Rectangel();
		
		sc.Initia(10, 20);
		sc.RecArea();
		sc.RecPerimeter();
		sc.Display();

	}

}

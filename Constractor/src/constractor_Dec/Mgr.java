package constractor_Dec;

public class Mgr {
	String name;
	int age;
	long mobile;
	
	Mgr(String name,int age,long mobile){
		this.name = name; // this key word reference the current instance
		this.age = age;
		this.mobile = mobile;
		
	}
	
	public void Display() {
		System.out.println(name );
		System.out.println(age );
		System.out.println(mobile );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mgr sc = new Mgr("Subhendu",23,876848132);
		sc.Display();
		Mgr sc1 = new Mgr("Rajat",23,848132);
		sc1.Display();
		
	}

}

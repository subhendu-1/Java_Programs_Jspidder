package class_Task;

public class Practice {
	static {
		System.out.println("static 1");
		Practice a = new Practice();
		
	}
	{
		System.out.println("Non 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Practice a = new Practice();
		}
		
	}
	
	{
		System.out.println("non-2");
	}
	static {
		Practice a = new Practice();
		System.out.println("Static 2");
	}

}

package constractor_Dec;

public class CallTo_this {
	
	CallTo_this(){
		System.out.println("NO arguments");
	}
	
	CallTo_this(int i){
		this();
		System.out.println("CallTo_this(i): " + i);
	}
	
	CallTo_this(int i,int j){
		this(i);
		System.out.println("CallTo_this(i,j): " + i + " " + j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallTo_this sc = new CallTo_this(10,20);

	}

}

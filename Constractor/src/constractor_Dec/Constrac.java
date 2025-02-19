package constractor_Dec;

public class Constrac {
	//constractor is always non static it is used to initialized non static
	// ever
	
	// if we not created constractor default constractor is availabele in any class 
	//if we created explictly any constractor compiler does not created  default constractor
	Constrac(){
		System.out.println("Call constractor");
	}
	
	//parmitarized constractor 
	Constrac(int i )
	{
		System.out.println("Paramitarized constractor" + i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constrac sc = new Constrac();
		new Constrac();
		new Constrac();
		new Constrac(10);
		new Constrac(20);

		
		
		
	}

}

class Bitwise 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = 1;
		//bitwise Operator :- in bitwise operator first check the both condition if any false condition is their )

		/*if(i++ > 2 & ++j > 2 );
		System.out.println(i);
		System.out.println(j);*/
		//Logical AND Operator:- in this operator when any condition is false then control not go to next operation 
        if(i++ > 2 && ++j > 2 );
		System.out.println(i);
		System.out.println(j);

		int a = 45;
		int b = -36;

		int c = a&b;
		int d = a|b; // after or operation binary result is comming in sign bit '1' that's why this number is store in memory using 2's compliment
		System.out.println(c);
		System.out.println(d);

		int e = 42;
		int f = -32;

		int g = e|f;

		int h = 72;
		int k = -24;
		int l = h|k;
		System.out.println(l);

		int m = -30;
		int n = ~m;
		System.out.println(n);

		//sign bit right shifft :- when we right shift any number then we add msb bit same sign bit will be added.   but here we know the result is commint -ve or +ve
		int o = 55;
		int p = o>>1;
		int z = o >> 34; // shifting input you can give  in memory shifting done by 34%32 = 2;  this is depend on datatype 
		System.out.println(z);

		// unsigned right shift :- when we right shift in this here we add in msb bit is 0;  
			
		int r = -55;
		int s = r >>> 2;
		System.out.println(s);
        //Left Shift:- in left shift  we add 0 on LSB bits in here we don't say reult is negative or positive 
		int t = -55;
		int y = t << 4;
		int x = t << 27;
		System.out.println(y);



		//n = -10
			//n = (~n)+1
			int a1 = -10;
			int b1 = ~a1 + 1;
			System.out.println(b1);



			//interviw question:- How to check any number is +ve or -ve ?

			//bitmusking

			// when we AND operation with '1' any number then we get the lsb another bit we masking through this bitmasking
			
			if((t&1) == 0){
				System.out.println("Thsi is even");
			}
			else {
				System.out.println("This is Odd");
			}
				

	}
}

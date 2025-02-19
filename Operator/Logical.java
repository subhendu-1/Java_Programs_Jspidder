class Logical 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 7;
		
		//System.out.println((a+1) && (a+2));  // Here we just use Rlational operators that's why this is give error  bad operand types for binary operator '&&'
		//in and operator if (one ) condition is false it is not check next condtion
		
		//And operator will check for both the conditon if both the condition is ture it will return ture if any one of the condtion is false it will return false;
		//OR operator if any one of the condition is ture it will return ture
		//will get raper upper error because    to exequte this program 
		
		//System.out.println(++a>5);
		System.out.println(a < b &&  b > a);
		System.out.println(a < b ||  b > a);
		System.out.println(!(a == 0));
		

//Example 1    In logical AND if any expression is false Othere expression will not evaluated that's why 'b' value is not incrimented
		System.out.println(a++>=5 && ++b>6); 
		System.out.println(a);
		System.out.println(b);

        System.out.println(a++>5 && ++b>6); 
		System.out.println(a);
		System.out.println(b);

//Example 2 : here we use Bitwise operator here first check both te expression then decied
	    System.out.println(++a>5 & ++b>6); 
		System.out.println(a);
		System.out.println(b);




	
		{
		}
	}
}

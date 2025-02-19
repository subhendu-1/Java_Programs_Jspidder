
//to call non-static method,atleast 1 object is reqired
//this is refering in our program this class is put our program
import java.util.Scanner;


class Test2
{
	public static void main(String[] args) 
	{
	  // Scan the data at run time 
	  // Scan the data in two sources 1) cmd or text file sources is defie
	    // this is through file source
		//Scanner scn = new Scanner("file path");
		// this is through cmd
		Scanner scn = new Scanner(System.in);  // q.in indecate cmd  Scanner obj is created, source is command prompt
		System.out.println("Enter Your name");

		String s1 = scn.next(); // go to cmd capture the input return in s1 string,next method always return here string value every call it is take one token
		System.out.println("s1 = " + s1);
		//String  = scn.nextLine();  // 
		String s2 = scn.next();  // 
		System.out.println("name is " + s2);


		// for iteger input we use method nextInt  for bit nextByte for nextfloat()///   Here only char type is not their
		System.out.println("Enter the first number");
		int a2 = scn.nextInt();
		

		System.out.println("Enter the scond number");
		int a1 = scn.nextInt();
		System.out.println(a1 + a2);
	}
}

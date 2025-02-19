

//using address immideatly rether then store balue in varialbe

class D
{
	int i;
}
class  Test5
{
	public static void main(String[] args) 
	{

		//new D().i;
		//System.out.println(D.i); //error not a statement// we not geting the reference or address of this object that's why we don't use this  that's why sefer side use through variable
		System.out.println(new D().i);
	}
}

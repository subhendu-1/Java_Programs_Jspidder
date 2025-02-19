package constractor_Dec;

public class Constractor_Overloading {
	 
		String name;
		String color;
		int number;
		double price;
		
		Constractor_Overloading(){};
		
		Constractor_Overloading(String name){
			this.name = name;
		}
		
		Constractor_Overloading(String name,String color){
			this.name = name;
			this.color = color;
		}
		
		Constractor_Overloading(String name,String color,int number,double price){
			this.name = name;
			this.color = color;
			this.number = number;
			this.price = price;
		}
		
		public void Display() {
			System.out.println(name + "\n" + color + "\n" + number + "\n" + price);
		}
	

	public static void main(String[] args) {
		Constractor_Overloading sc = new Constractor_Overloading();
		Constractor_Overloading sc1 = new Constractor_Overloading("BMW" ,"blue");
		Constractor_Overloading sc2 = new Constractor_Overloading("ROYAL","BLACK",2228,2.5);
		
		sc.Display();
		sc1.Display();
		sc2.Display();
	}
}

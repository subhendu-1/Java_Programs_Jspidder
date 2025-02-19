package com.FactoryPattern;
import java.util.*;
public class InputUseingFactory {
	public class Book{
		String name;
		String auth;
		int price;
		
		public Book(String name,String auth,int price) {
			this.name = name;
			this.auth = auth;
			this.price = price;
		}
		
		public void Display() {
			System.out.println(name + "\n" + auth + "\n" + price);
		}
		
		public static Book createBook() {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the details");
			String name = s.next();
			String auth = s.next();
			int price = s.nextInt();
			
			return new Book(name,auth,price);
		}
	}
}

package com.FactoryPattern;

import com.FactoryPattern.InputUseingFactory.Book;

public class DerivedInputUseingFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = b1.createBook();
		Book b2 = b1.createBook();
		b1.Display();
		b1.Display();
	}

}

package com.Java_8;

import java.util.function.Consumer;

public class ConsumerFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"java","python","spring","Hibernet"};
		
		Consumer<String> cn = i -> System.out.println(i.toUpperCase());
		
		for(String s:str) {
			cn.accept(s);
		}
	}

}

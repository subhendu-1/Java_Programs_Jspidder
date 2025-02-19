package com.Java_8;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		
		l.add(2);
		l.add(4);
		l.add(5);
		l.add(8);
		l.add(10);
		
//		l.stream().filter(i->i%2!=0).forEach(i->System.out.println(i));
//		count the even and odd number
		long total = l.stream().count();
		long even = l.stream().filter(i->i%2==0).count();
		System.out.println("Even number is: " + even);
		System.out.println("Odd number is: "+ (total-even));
		
		
		

	}

}

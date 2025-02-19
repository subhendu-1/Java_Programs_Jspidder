package com.Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1,2,3,4,5);
		
		Function<Integer,Integer> fn = (i) -> {return i*i;};
		
		int[] a = new int[l.size()];
		int c = 0;
		for(Integer i:l) {
//			System.out.print(fn.apply(i)+ " ");
			a[c++] = fn.apply(i);
		}
		
		System.out.println(Arrays.toString(a));
		
		
List<String> s = Arrays.asList("1","2","3","4","5");
		
		Function<String,Integer> sTi = str -> Integer.parseInt(str);
		int[] a1 = new int[l.size()];
		int c1 = 0;
		for(String i:s) {

			
			a1[c1++] = sTi.apply(i);
		}
		
		System.out.println(Arrays.toString(a1));
	}

}

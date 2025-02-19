package com.Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Find the even number in array using predicat Fucntional Interface
		List<Integer> l = Arrays.asList(20,15,25,30,40);
		Predicate<Integer> p = i -> i%2==0;
		
		
		
		for(Integer i:l) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}

	}

}

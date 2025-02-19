package com.Java_8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmpDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp("Rjat",1,24,20000);
		Emp e2 = new Emp("Raj",2,23,10000);
		Emp e3 = new Emp("Subhendu",3,25,50000);
		Emp e4 = new Emp("Raju",4,21,25000);
		Emp e5 = new Emp("Faiz",5,20,120000);
		
		Emp[] e = {e1,e2,e3,e4,e5};
		
		Predicate<Emp> p = i -> i.sal <= 20000;
		
		Consumer<Emp> em = i -> System.out.println(i.name + i.sal);
		
		Function<Emp,Integer> fn = i -> {
			int b = 0; 
			if(i.sal <= 20000) {
				b = (i.sal * 50)/100;
				return b;
			}else {
				b = (i.sal*20)/100;
				return b;
			}
		};
		
		for(Emp i:e) {
//			System.out.println(fn.apply(i));
			if(p.test(i)) {
//				System.out.println(i);
				em.accept(i);
				
			}
		}
	}

}

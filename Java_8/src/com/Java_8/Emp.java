package com.Java_8;

public class Emp {

		String name;
		int Eid;
		int age;
		int sal;
		
		Emp(String name,int Eid,int age,int sal){
			this.name = name;
			this.Eid = Eid;
			this.age = age;
			this.sal = sal;
		}
	    @Override
		public String toString() {
			return ("["+name+" " + Eid + " " + age + " " + sal + "]");
			
		}

}

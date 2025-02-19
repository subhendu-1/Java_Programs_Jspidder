package com.String;

public class Missing_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Ayvak";
		
		String str = "AEIOUaeiou";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(s.contains(ch+"")) {
				continue;
			}
			System.out.println(ch);
		}
		
		

	}

}

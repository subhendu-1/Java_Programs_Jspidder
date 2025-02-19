package com.String;

public class Replace_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		String vowel = "AEIOUaeiou";
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(vowel.contains(ch + "")) {
				s = s.replace(ch+"", "");
			}
		}
		System.out.println(s);

	}

}

package com.String;

public class SmallWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is easy";
		
		String[] s = str.split(" ");
		int count = Integer.MAX_VALUE;
		String ansString = "";
		for(int i = 0; i < s.length; i++) {
			if(count > s[i].length()) {
				count = s[i].length();
				ansString = s[i];
			}
		}
		System.out.println(ansString);

	}

}

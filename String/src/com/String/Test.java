package com.String;

public class Test {
	
	public static String Single_line(String s) {
		String ans = "";
		for(int i = 0; i < s.length(); i++) {
//			System.out.println(str.charAt(i));
			char ch = s.charAt(i);
			if(i == s.length()-1) {
				ans += ch;
				break;
			}
			ans += ch + ",";
		}
		return ans;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Jspider";
		
		System.out.println(str.length());
		System.out.println(str.charAt(str.length()-2));
		
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		String result = Single_line(str);
		System.out.println(result);
		
//		for(int i = 0; i < .length(); i++) {
//			System.out.println(str.charAt(i));
//		}

	}

}

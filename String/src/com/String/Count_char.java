package com.String;

public class Count_char {
	
	public static String ArrangeString(String str) {
		String ans = "";
		
		String UC = "",LC = "",NC = "",SC = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') UC += ch;
			else if(ch >= 'a' && ch <= 'z') LC += ch;
			else if(ch >= '0' && ch <= '9') NC += ch;
			else SC += ch;
			
			
		}
		
		return UC + LC + NC + SC;
	}
	public static void main(String[] args) {
		String str = "Aah21&adNSE23";
		int UC = 0,LC = 0,NC = 0,SC = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') UC++;
			else if(ch >= 'a' && ch <= 'z') LC++;
			else if(ch >= '0' && ch <= '9') NC++;
			else SC++;
			
			
		}
		System.out.println(UC);
		System.out.println(LC);
		System.out.println(NC);
		System.out.println(SC);
		
		
		String result = ArrangeString(str);
		System.out.println(result);
	}

}

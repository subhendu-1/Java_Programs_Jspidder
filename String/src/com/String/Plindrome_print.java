package com.String;

public class Plindrome_print {
	
	public static boolean isPlindrome(String str) {
		char[] ch = str.toCharArray();
		int i = 0;
		int j = ch.length-1;
		while(i<=j) {
			if(ch[i] != ch[j]) return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam sir madam";
		String st = "";
		String[] s = str.split(" ");
		for(int i = 0; i < s.length; i++) {
			if(isPlindrome(s[i])) {
				if(i == s.length -1) {
					st += s[i];
					break;
				}
				st += s[i] + " ";
			}
		}
		
		System.out.println(st);
	}

}

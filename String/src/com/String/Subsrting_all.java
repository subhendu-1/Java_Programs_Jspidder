package com.String;

public class Subsrting_all {
	
	public static boolean isPlindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		
		while(i<=j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalam";
		String ans = "";
		int len  = str.length();
		
		for(int i = 0; i < str.length()-1;i++) {
			for(int j = i+3	; j < str.length();j++) {
				String s = str.substring(i,j);
//				System.out.println(str.substring(i,j));
				if(isPlindrome(s)) {
					if(s.length() > len) {
						len = s.length();
						ans = s;
					}
					
				}
			}
		}
		
		System.out.println(ans);
	}

}

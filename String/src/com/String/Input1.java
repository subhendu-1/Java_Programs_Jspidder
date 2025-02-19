package com.String;

public class Input1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbccadd";
		
		String ans = "";
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count = 1;
			for(int j = i+1; j < s.length(); j++) {
				if(ch == s.charAt(j)) {
					count++;
				}else {
					
					break;
				}
			}
			
			ans = ans + (ch + "") + (count + "");
			
			i += count - 1;
		}
		System.out.println(ans);

	}

}

package com.String;

public class Count_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabaaccbb";
		
		while(str.length() != 0) {
			String st = "";
			char ch = str.charAt(0);
			
			st = str.replace(ch+"", "");
			int count = str.length() - st.length();
			str = st;
			System.out.println(ch+":"+count);
		}
	}

}

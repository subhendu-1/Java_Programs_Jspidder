package com.String;

public class Input3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is easy";
		for(int i = 0; i < str.length(); i++) {
			while(i < str.length() && str.charAt(i)!=' ') {
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
	}

}

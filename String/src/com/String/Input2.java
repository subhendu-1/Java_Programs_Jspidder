package com.String;

public class Input2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Subhendu";
		
		for(int i = 0; i <= str.length(); i++) {
			for(int j = 0; j < i ;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

}

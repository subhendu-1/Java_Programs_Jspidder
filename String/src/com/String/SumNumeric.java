package com.String;

public class SumNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Aah21&adNSE23";
		int UC = 0,LC = 0,NC = 0,SC = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				NC += ch - '0';
			}
		}
		System.out.println(NC);
	}

}

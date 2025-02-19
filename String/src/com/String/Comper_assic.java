package com.String;

public class Comper_assic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabccad";
		
//		for(int i = 0; i < str.length()-1; i++) {
//			char ch = str.charAt(i);
//			for(int j = i+1; j < str.length();j++) {
//				char ch2 = str.charAt(j);
//				if((ch2-'0') < (ch - '0')) {
//					char temp = ch2;
//					ch2 = ch;
//					ch = temp;
//				}
//			}
//			System.out.print(ch);
//		}
		
		
		char[] ch = str.toCharArray();
		
		for(int i = 0; i < ch.length-1; i++) {
			for(int j = 0;j < ch.length-1-i; j++) {
				if(ch[j] > ch[j+1]) {
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
			
		}
		System.out.print(ch);
		
	}

}

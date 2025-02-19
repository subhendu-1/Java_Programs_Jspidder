package com.String;

public class Init_cap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str = "subhendu adak ";
		char[] ch = Str.toCharArray();
		
		for(int i = 0; i < ch.length-1; i++) {
			if(i == 0) { 
				ch[i] = (char)(ch[i] - 32);
			}
			
			if(ch[i] == ' ') {
				ch[i+1] = (char) (ch[i+1] - 32);
			}
			
//			for(int j = i+1; j < ch.length; j++) {
//				if(ch[j] == ' ') {
//					ch[j+1] = (char) (ch[j+1] - 32);
//				}
//			}
			
		}
		
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}

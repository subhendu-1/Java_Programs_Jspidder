package com.String;

public class Insert_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World";
		char[] ch = s.toCharArray();
//		String temp = "";
		
		for(int i = 0; i < ch.length; i++) {
			int count = 1;
			boolean flag = false;
//			if(ch[i] >= 0 && ch[i] <= 9) {
//				continue;
//			}
			
			for(int j = i+1; j < ch.length; j++) {
				if(ch[i] == ch[j] && ch[j] != ' ') {
					count++;
					ch[j] = (char)count;
//					temp += ch[j];
					flag = true;
				}
			}
			
			if(flag) {
				ch[i] = '1';
				
			}
			else {
				ch[i] = ch[i];
			}
		}
		
		
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}

}

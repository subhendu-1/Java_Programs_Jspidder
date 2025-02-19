package com.String;

public class Change_consonent {
	
	public static int Find_count(String str) {
		int count = 0;
		String str1 = "AEIOUaeiou";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(str1.indexOf(ch + "") == -1){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "Amaran";
		String str = "Java";
		
		char[] ch = str.toCharArray();
		String str1 = "AEIOUaeiou";
		
		int cnt = Find_count(str);
		
		System.out.println(cnt);
		
		if(cnt >= 3) {
			for(int i = 0; i < ch.length; i++) {
				if(str1.contains(ch[i] + "")) {
					continue;
				}
				ch[i] = '_';
			}
			
		}
		
		

		System.out.println(ch);

	}

}

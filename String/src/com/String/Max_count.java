package com.String;

public class Max_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "javvvaaaa";
		char[] ch = s.toCharArray();
		
		int max = Integer.MIN_VALUE;
		char st='\u0000';
		
		for(int i = 0; i < ch.length; i++) {
			int count = 1;
			if(ch[i] == '\u0000') {
				continue;
			}
			
			for(int j = i+1; j < ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
					ch[j] = '\u0000';
				}
			}
			
			if(count > max) {
				max = count;
				st = ch[i];
			}
		}
		
		System.out.println(st + ":" + max);

	}

}

package com.String;

public class Slit_sub_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "RLRRRLLRLL";
		
		int count = 0;
		int Rcnt = 0;
		int Lcnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'R') Rcnt++;
			if(str.charAt(i) =='L') Lcnt++;
			
			if(Rcnt == Lcnt) {
				count++;
				Rcnt = 0;
				Lcnt = 0;
			}
			
			
//			for(int j = i+1; j < str.length(); j++) {
//				if(str.charAt(j) == 'R') Rcnt++;
//				if(str.charAt(j) =='L') {
//					Lcnt++;
//					if(Rcnt == Lcnt) {
//						
//						count++;
//						i = j;
//						Rcnt = 0;
//						Lcnt = 0;
//						break;
//						
//					}
//				}
//			}
		}
		System.out.println(count);
	}

}

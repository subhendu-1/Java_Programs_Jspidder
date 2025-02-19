package com.String;

public class Min_substring {
	
	public static boolean isPalindrome(String str) {
		int i = 0; 
		int j = str.length() - 1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
        String s = "malayalam";
        int min_length = Integer.MAX_VALUE;
        
        String min_plin = "";

        for (int i = 0; i < s.length(); i++) { 
            for (int j = i + 1; j <= s.length(); j++) { 
                String st = s.substring(i, j);
                if (isPalindrome(st) && st.length() > 1 && st.length() < s.length()) {
                	if(st.length() < min_length) {
                		min_length = st.length();
                		min_plin = st;
                	}
                  
                }
            }
        }
        
        System.out.println(min_plin);
    }

}

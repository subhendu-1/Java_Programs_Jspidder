package com.String;

public class Second_smallest_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,2};
		
		int s1 = arr[0];
		int s2 = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == s1) continue;
			if(arr[i] < s1) {
				s2 = s1;
				s1 = arr[i];
			} else if(arr[i]< s2 || s1 == s2) {
				s2 = arr[i];
			}
		}
		
//		for(int i : arr) {
//			System.out.println(i);
//		}
		
		System.out.println(s2);
	}

}

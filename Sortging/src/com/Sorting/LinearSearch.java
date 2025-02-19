package com.Sorting;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,1,6,2,7,8};
		System.out.println(Linear(a,9));
		System.out.println(Linear(a,7));
	}
	
	public static int Linear(int[] a,int key) {
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key) return i;
		}
		return -1;
	}

}

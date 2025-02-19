package com.Sorting;

import java.lang.*;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,2,7,2,1,4};
		System.out.println(Arrays.toString(a));
		
		sort(a);
		
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void sort(int[] a) {
		for(int i = 0; i < a.length -1; i++) {
			for(int j = 0; j < a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

}

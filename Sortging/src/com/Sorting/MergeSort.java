package com.Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,6,1,8,9,5};
		
//		int[] arr1 = {3,2,6,1,8,9,5};
//		int[] ans = new int[arr.length+arr1.length];
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		merge(arr,arr1,ans);
//		System.out.println(Arrays.toString(ans));
	}
	
	public static void sort(int[] a) {
		if(a.length == 1) return;
		int[] left = new int[a.length/2];
		
		int[] right = new int[a.length - left.length];
		
		for(int i = 0; i < left.length; i++) {
			left[i] = a[i];
		}
		
		for(int j = 0; j < right.length; j++) {
			right[j] = a[j+left.length];
		}
		
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	
	public static void merge(int[] a,int[] b,int[] c) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < a.length && j < b.length) {
			if(a[i] < b[j]) 
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		
		while (i < a.length) {
			c[k++] = a[i++];
		}
		
		while (j < b.length) {
			c[k++] = b[j++];
		}

	}

}

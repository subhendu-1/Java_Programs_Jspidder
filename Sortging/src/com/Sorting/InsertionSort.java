package com.Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,2,5,1,6};
		
		System.out.println(Arrays.toString(a));
		
		sort(a);
		
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
			
		}
	}
}

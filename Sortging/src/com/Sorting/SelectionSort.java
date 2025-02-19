package com.Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,2,5,1,6};
		
		System.out.println(Arrays.toString(a));
		
		sort(a);
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int index = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[i]) index = j;
			}
			if(i != index) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}

}

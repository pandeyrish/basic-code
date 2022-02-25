package Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int [] arr = {0,6,4,1,6,3,5,0,7};
//		int [] arr= {11,-11};
//		int [] arr= {};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
			
	}
	
	//Implementation
	static void bubbleSort(int[] arr) {
		int len =arr.length;
		for (int i =0; i<len-1; i++) {
			for (int j=1;j<len-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j]= arr[j-1];
					arr[j-1]= temp;
				}
			}
		}
	}
	/*
	 //Second Implementation, swap logic placed in a seperate function
	static void bubbleSort(int[] arr) {
		int len =arr.length;
		boolean issorted;
		
		for (int i =0; i<len; i++) {
			issorted=true;
			for (int j=1;j<len-i;j++) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
					issorted=false;
				}
			}
			if(issorted)
				return;
		}
	}
	
	static void swap(int[] arr, int i, int j){	
		int temp =arr[j];
		arr[j]=arr[i];
		arr[i] = temp;
	}
	*/
}

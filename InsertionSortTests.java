package Sorting;
import java.util.*;
public class InsertionSortTests {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len = scan.nextInt();
		int [] arr = new int[len];
		 
		Random rand = new Random();
		for(int i=0; i<len;i++) {
			arr[i]=rand.nextInt(10000000);
		}
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(arr));
	
		System.out.println("");
		insertionSort(arr);
		
		System.out.println("Array after sorting");
		System.out.println("");
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Done");
		scan.close();
	}
	
	public static void insertionSort(int [] arr) {
		int count =1;
		int len = arr.length;
		for(int i=1;i<len;i++) {
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			count ++;
		arr[j+1]=temp;	
		}
		System.out.println("Count is :" + count);
		
	}
	

}

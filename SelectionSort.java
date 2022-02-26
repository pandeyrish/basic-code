//Insertion sort is very similar to selection sort.
//As in selection sort, after k passes through the array, the first k elements are in sorted order.
//However, the fundamental difference between the two algorithms is that 
//insertion sort scans backwards from the current key, while selection sort scans forwards.
//This results in selection sort making the first k elements the k smallest elements of the unsorted input,
//while in insertion sort they are simply the first k elements of the input.
package Sorting;
import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args) {
		int [] arr= {19,11,23,78,11};
		int len =arr.length;
		
		for (int i=0; i< len; i++) {
			int tempindx= i;
			for(int j=i+1;j<len;j++) {
				if(arr[j-1]>arr[j])
					tempindx=j;
			}
			var temp = arr[tempindx];
			arr[tempindx]= arr[i];
			arr[i]= temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
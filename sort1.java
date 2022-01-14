/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class sort1 {

	/**
	 * @param args
	 */
	public static void printArr() {
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void swap(int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static boolean isSorted() {
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void bubbleSort() {
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1;j++) {				
				if(arr[j]>arr[j+1]) {					
					swap(j,j+1);
					printArr();
					if(isSorted()) {
						return;
					}
				}
			}
		}
	}
	
	public static int arr[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		arr = new int[N];
		for(int i = 0;i<N;i++) {
			arr[i] = in.nextInt();
		}
		printArr();
		bubbleSort();
	}

}
/*
9 1 2 6 4 7
1 9 2 6 4 7
1 2 9 6 4 7
1 2 6 9 4 7
1 2 6 4 9 7
1 2 6 4 7 9
1 2 4 6 7 9
*/
/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class tle15p1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		String names[]= new String[N];
		int arr[] = new int[N];
		Arrays.fill(arr, 0);
		for(int i = 0;i<N;i++) {
			names[i] = in.next();
		}
		for(int i = 0;i<M;i++) {
			for(int j = 0;j<N;j++) {
				arr[j] += in.nextInt();
			}
		}
		boolean swapped = true;
		int u = 0;
		int iTemp;
		String sTemp;
		while(swapped) {
			swapped = false;
			u++;
			for(int i = 0;i<N-u;i++){
				if(arr[i]>arr[i+1]) {
					iTemp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]=iTemp;
					
					sTemp = names[i];
					names[i] = names[i+1];
					names[i+1]=sTemp;
					
					swapped = true;
				}
			}
		}
		for(int i = N-1;i>=0;i--) {
			System.out.println(N-i+2+". "+names[i]);
		}
	}

}              
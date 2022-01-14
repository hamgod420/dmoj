/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class ccc12s1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int J = in.nextInt();
		int arr[]=new int[J];
		int ans = 0;
		for(int i = 1;i<=J;i++) {
			arr[i-1]=i;
		}
		if(J<4) {
			System.out.println(0);
			return;
		}else {
			for(int i=1;i<J;i++) {
				for(int j = 1;j<J;j++) {
					for(int k =1;k<J;k++) {
						if(arr[i]<arr[j] && arr[j]<arr[k]) {
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
		}
		
		
	}

}

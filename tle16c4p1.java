/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class tle16c4p1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int N = in.nextInt();
		
		int arr[] = new int[N];
		
		for(int i = 0;i<N;i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		int ans = 1;
		int sum = 0;
		for(int i = 0;i<N;i++) {
			sum += arr[i];
			if(sum>arr[N-1]) {
				System.out.println(ans);
				break;
			}else {
				ans+=1;
			}
		}
		
		
		
	}

}

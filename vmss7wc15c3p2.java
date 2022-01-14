/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class vmss7wc15c3p2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		
		int arr[] = new int[N];
		for(int i = 0;i<N;i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int ans = 0;
		int temp = N-1;
		for(int i = 0;i<K;i++) {
			ans += arr[temp];
			temp-=1;
		}
		System.out.println(ans);
	}

}

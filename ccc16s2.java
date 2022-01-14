/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class ccc16s2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();
		int N = in.nextInt();
		int arr1[] = new int[N];
		int arr2[] = new int[N];
		int ans = 0;
		if(Q==1) {
			for(int i = 0;i<N;i++) {
				arr1[i] = in.nextInt();
			}
			for(int i = 0;i<N;i++) {
				arr2[i] = in.nextInt();
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i = 0;i<N;i++) {
				ans += Math.max(arr1[i], arr2[i]);
			}
		}else {
			for(int i = 0;i<N;i++) {
				arr1[i] = in.nextInt();
			}
			for(int i = 0;i<N;i++) {
				arr2[i] = in.nextInt();
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			int cnt = N-1;
			for(int i = 0;i<N;i++) {
				ans += Math.max(arr1[i], arr2[cnt]);
				cnt-=1;
			}
		}
		System.out.println(ans);
		
	}

}

/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class dmopc15c6p3 {

	/**
	 * use difference array
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		long K = in.nextLong();
		long diff[] = new long[M+1];
		diff[1]=M;
		//diff[i] = num of potatoes in that column
		//[M,M,M,M,M,M]
		//becomes [M,0,0,0,0,0]
		//diff[i]=arr[i]-arr[i-1]
		while(M --> 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			//updating difference array
			diff[a]--;
			diff[b + 1]--;
		}
		//changing from DA to normal array
		for(int i = 1;i<=N;i++) {
			diff[i] += diff[i - 1];
		}
		int ans = Integer.MAX_VALUE;
		int l = 1, r = 0;
		long sum = 0;
		while(r <= N) {
			if(sum < K) {
				sum += diff[++r];
			}else if(sum >= K) {
				ans = Math.min(ans, r - l + 1);
				sum -= diff[l++];
			}
		}
		if(ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}

}

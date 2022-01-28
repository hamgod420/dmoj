/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class ccc12s5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int dp[][] = new int[r+1][c+1];
		int K = in.nextInt();
		for(int i = 0;i<K;i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			dp[x][y] = -1;
		}
		dp[1][1]=1;
		for(int i = 1;i<=r;i++) {
			for(int j = 1;j<=c;j++) {
				if(dp[i][j]== -1) {
					dp[i][j] = 0;
					continue;
				}
				dp[i][j] += dp[i-1][j] + dp[i][j-1];
			}
		}
		System.out.println(dp[r][c]);
	}

}

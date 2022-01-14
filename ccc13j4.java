/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class ccc13j4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int C = in.nextInt();
		int arr[] = new int[C];
		for(int i = 0;i<C;i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int ans = 0;
		for(int i : arr) {
			if(i>T) {
				break;
			}else {
				T-=i;
				ans++;
			}
		}
		System.out.println(ans);
	}

}

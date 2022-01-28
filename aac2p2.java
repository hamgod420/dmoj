/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class aac2p2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		Set<Long>set=new HashSet<>();
		long arr[]=new long[N+5];
		for(int i = 0;i<N;i++) {
			arr[i] = in.nextLong();
			set.add(arr[i]);
		}
		if(N==2) {
			if((arr[0]+arr[1])%2==0) {
				System.out.println(2);
			}else {
				System.out.println(1);
			}
		}else {
			for(int i = 0;i<N;i++) {
				for(int j = i+1;j<N;j++) {
					if((arr[i]+arr[j])%2==0 && set.contains((arr[i]+arr[j])/2)) {
						System.out.println(3);
						System.exit(0);
					}
				}
			}
			System.out.println(2);
		}
	}

}

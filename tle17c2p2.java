/**
 * 
 */
package codingclass;

import java.util.*;
import java.io.*;
/**
 * @author hamgod
 *
 */
public class tle17c2p2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int K = readInt();		
		int u;
		int arr[]=new int[1000005];
		int psa[]=new int[1000005];
		for(int i = 0;i<K;i++) {
			u = readInt();
			arr[u]=1;
		}
		for(int k=1;k<1000005;k++) {
			psa[k]=psa[k-1]+arr[k];
		}
		int N = readInt();
		for(int i = 0;i<N;i++) {
			int f = readInt();
			System.out.println(f-psa[f-1]);
		}
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String read() {
        while (st == null || !st.hasMoreTokens()) {
            try { st = new StringTokenizer(br.readLine());
            } catch (IOException e) {}
        }
        return st.nextToken();
    }
    static int readInt() {
        return Integer.parseInt(read());
    }
    static long readLong() {
        return Long.parseLong(read());
    }
    static double readDouble() {
        return Double.parseDouble(read());
    }

}
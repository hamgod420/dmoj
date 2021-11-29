/**
 * 
 */
package codingclass;

import java.io.*;
import java.util.*;

/**
 * @author hamgod
 *
 */
public class tle17c8p2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int H,D,E;
		H = readInt();
		D = readInt();
		E = readInt();
		
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

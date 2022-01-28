/**
 * 
 */
package codingclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 * @author hamgod
 *
 */
public class ddrp3 {

	/**
	 * @param args
	 */
	public static int N,M,S,T,x,y;
	public static int levels[];
	public static LinkedList<Integer>mat[];
	
	public static void bfs() {
		Deque<Integer>dq = new LinkedList<Integer>();
		levels[S]=0;
		dq.add(S);
		while(!dq.isEmpty()) {
			int cur = dq.pop();
			int level = levels[cur];
			for(int adj : mat[cur]) {
				if(levels[adj] != -1) {
					continue;
				}
				levels[adj] = level+1;
				dq.add(adj);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N = readInt();
		M = readInt();
		mat = new LinkedList[1000005];
		levels = new int [1000005];
		for (int i = 0; i < 1000005; i++) {
            mat[i] = new LinkedList<>();
        }
		for(int i = 0;i<M;i++) {
			x = readInt();
			y = readInt();
			mat[x].add(y);
			mat[y].add(x);
		}
		Arrays.fill(levels,0,N+1,-1);
		S = readInt();
		T = readInt();
		
		bfs();
		
		System.out.println(M-levels[T]);
	}
	//Buffered reader for input
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

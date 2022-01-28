/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class aac2p3 {

	/**
	 * @param args
	 */
	
	public static boolean bfs(int x) {
		Queue<Integer> qx = new LinkedList<>();
		Queue<Integer> qy = new LinkedList<>();
		boolean vis[][] = new boolean[N+5][M+5];
		if(validate(1,1,x)) {
			qx.add(1);
			qy.add(1);
			vis[1][1] = true;
		}
		while(!qx.isEmpty()) {
			int r = qx.poll(),c = qy.poll();
			for(int d = 0;d<4;d++) {
				int nr = r +dir[d][0],nc= c + dir[d][1];
				
			}
		}
	}
	public static boolean validate(int r1,int c1,int x) {
		int r2 = r1 + x-1,c2=c1+x-1;
		return(psa[r2][c2]-psa[r1-1][c2]-psa[r2][c1-1]+psa[r1-1][c1-1])==0;
	}
	public static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
	public static int N,M,psa[][];
	public static char grid[][];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	    N = in.nextInt();
	    M = in.nextInt();
	    
	    psa = new int[N+5][M+5];
	    grid = new char[N+5][M+5];
	    for(int i = 1;i<=N;i++) {
	    	String s = in.next();
	    	for(int j = 1;j<=M;j++) {
	    		grid[i][j]=s.charAt(j-1);
	    		if(grid[i][j]=='X') {
	    			psa[i][j]=1;
	    		}
	    		psa[i][j] += psa[i-1][j] + psa[i][j-1] - psa[i-1][j-1];
	    	}
	    }
	    int start = 1,end = Math.min(N, M);
	    
	    
	}

}

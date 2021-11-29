/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class graph2p3 {

	/**
	 * How many edges to remove to make it a tree
	 */
	public static void dfs(int n) {
		vis[n] = true;
		for(int v = 0;v<N;v++) {
			if(adj[n][v]==1 && !vis[v]) {
				dfs(v);
			}
		}
	}
	public static int N;
	public static int adj[][];
	public static boolean vis[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		adj = new int[N][N];
		int edges = 0;int components=0;
		for(int i = 0;i<N;i++) {
			for(int j =0;j<N;j++) {
				adj[i][j]=in.nextInt();
				edges += adj[i][j];
			}
		}
		edges/=2;
		//divide by 2 since undirected
		//Works for 3/5 if you only match the edges to N-1
		for(int i =0;i<N;i++) {
			if(!vis[i]) {
				dfs(i);
				components++;
			}
		}
		int ans = edges-(N-components);
		System.out.println(ans);
	}

}

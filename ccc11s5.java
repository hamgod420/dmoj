/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class ccc11s5 {

	/**
	 * @param args
	 */
	public static int state = 0;
	public static int K;
	public static int dist = 0;
	public static boolean vis[];
	
	static int process(int num) {
        int count = 0;
        for (int i = 0; i <= K; i++) {
            if ((num & (1 << i)) == (1 << i)) {
                count++;
                continue;
            } else if (count >= 4) {
                int new_mask = ((1 << count) - 1) << (i - count);
                num ^= new_mask;
                return num;
            }
            count = 0;
        }
        return num;
    }
	
	public static void bfs() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(state);
		vis[state] = true;
		while(!queue.isEmpty()) {
			int sz = queue.size();
			for(int i = 0;i<sz;i++) {
				int cur = queue.poll();
				if(cur==0) {
					return;
				}
				for(int j = 0;j<K;j++) {
					if((cur&(1<<j))==0) {//checks the ith bit is 0
						int v = process(cur | (1<<j));
						if(!vis[v]) {
							queue.add(v);
							vis[v] = true;
						}
					}
				}
			}
			dist++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		K = in.nextInt();		
		for(int i = 0;i<K;i++) {
			int light = in.nextInt();
			state |= (light << i);
		}
		vis = new boolean[1<<K];
		bfs();
		System.out.println(dist);
	}

}

/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class fhc15c1p2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int i = 1;i<=T;i++) {
			int N = in.nextInt();
			Node root = new Node();
			int ans = 0;
			for(int j =1;j<=N;j++) {
				String word = in.next();
				ans += insert(root,word);
			}
			System.out.println("Case #"+i+": "+ans);
		}
	}
	static class Node{
		Node ch[];
		public Node() {
			ch = new Node[26];
		}
	}
	static int insert(Node root,String word) {
		Node cur = root;
		boolean prefix = true;// does the substring word[0,i] exist in my trie set? assume true
		int cnt = 0;
		for(int i = 0;i<word.length();i++) {
			int c = word.charAt(i) - 'a';
			 if(prefix) {
				 cnt++;
			 }
			 if(cur.ch[c] == null) {//points to nothing
				 cur.ch[c] = new Node();
				 prefix = false;
			 }
			 cur = cur.ch[c];
		}
		return cnt;
	}
	

}

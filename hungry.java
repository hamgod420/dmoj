/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class hungry {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		TreeMap<Integer,Integer>tasty = new TreeMap<>();
		TreeMap<Integer,Integer>fill = new TreeMap<>();
		for(int i = 0;i<N;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			tasty.put(a, i+1);
			fill.put(b, i+1);
		}
		for (Map.Entry<Integer, Integer> entry : tasty.entrySet()) {
			System.out.print(entry.getValue()+" ");
		}
		System.out.println();
		for (Map.Entry<Integer, Integer> entry : fill.entrySet()) {
			System.out.print(entry.getValue()+" ");
		}
		
	}

}

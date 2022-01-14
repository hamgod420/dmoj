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
public class ccc12s2 {

	/**
	 * @param args
	 */
	
	public static int roman(char c) {
		if(c=='I') {
			return 1;
		}
		if(c=='V') {
			return 5;
		}
		if(c=='X') {
			return 10;
		}
		if(c=='L') {
			return 50;
		}
		if(c=='C') {
			return 100;
		}
		if(c=='D') {
			return 500;
		}
		else {
			return 1000;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char carr[] = str.toCharArray();
		String arr[] = new String[str.length()/2+1];
		for(int i = 0;i<carr.length;i++) {
			if(i%2!=0) {
				arr[i/2] = String.valueOf(carr[i-1])+String.valueOf(carr[i]);
			}
		}
		arr[arr.length-1]="0I";
		int ans = 0;
		for(int i = 0;i<arr.length-1;i++) {
			int val = Integer.parseInt(arr[i].substring(0,1))*roman(arr[i].charAt(1));
			//System.out.println(val);
			
			if(roman(arr[i].charAt(1))<roman(arr[i+1].charAt(1))) {
				ans -= val;
			}else {
				ans += val;
			}
			
			
		}
		System.out.println(ans);
	}

}

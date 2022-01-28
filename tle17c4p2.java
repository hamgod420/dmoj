/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class tle17c4p2 {

	/**
	 * @param args
	 */
	public static int findSeconds(int h,int m,int s) {
		return (h*3600)+(m*60)+s;
	}
	public static boolean contains(String s[],int n) {
		for(String str : s) {
			if(n==Integer.parseInt(str)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		int h1,h2,m1,m2,s1,s2;
		String time[] = in.nextLine().split(":");
		
		h1 = (int)time[0].charAt(0) -48;
		h2 = (int)time[0].charAt(1) -48;
		m1 = (int)time[1].charAt(0) -48;
		m2 = (int)time[1].charAt(1) -48;
		s1 = (int)time[2].charAt(0) -48;
		s2 = (int)time[2].charAt(1) -48;
		System.out.println(h1+" "+h2+" "+m1+" "+m2+" "+s1+" "+s2);
		int desired = findSeconds(h1*10+h2,m1*10+m2,s1*10+s2);
		System.out.println(desired);
		String num[] = in.nextLine().split("");
		ArrayList<Integer>list= new ArrayList<Integer>();
		
		for(int i =0;i<=9;i++) {
			if(!contains(num,i)) {
				list.add(i);
				System.out.print(i+" ");
			}
		}
		
		
		//ab:cd:ef
		int tot1=0;
		for(int a = 0;a<=9;a++) {
			for(int b = 0;b<=9;b++) {
				for(int c = 0;c<=5;c++) {
					for(int d = 0;d<=9;d++) {
						for(int e =0;e<=5;e++) {
							for(int f =0;f<=9;f++) {
								if(!list.contains(a) && !list.contains(b) && !list.contains(c) && !list.contains(d) && !list.contains(e) && !list.contains(f)) {
									
									tot1 = findSeconds(a*10+b,c*10+d,e*10+f);
									//System.out.println(tot1);
									if(tot1>=desired) {
										System.out.println(a+""+b+":"+c+""+d+":"+e+""+f);
										System.out.println(tot1);
										System.exit(0);
									}
								}
							}
						}
					}
				}
			}
		}
		
	}

}

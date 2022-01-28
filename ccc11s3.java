/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class ccc11s3 {

	/**
	 * @param args
	 */
	public static int check(int m,int x) {
		if(m>=1) {
			int power = (int)Math.pow(5, m-1);
			int pos = (int)Math.floorDiv(x, power);
			if(pos==0 ||pos==4) {
				return 0;
			}else if(pos==1||pos==3) {
				return power+check(m-1,x%power);
			}else if(pos==2) {
				return 2*(power+check(m-1,x%power));
			}else {
				
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		while(T --> 0) {
			int m = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			if(y<check(m,x)) {
				System.out.println("crystal");
			}else {
				System.out.println("empty");
			}
		}
		
	}

}
/*
def crystalSquaresatX(m,x):
    if m >= 1:
        power = 5 ** (m-1)
        location = x // power
        if location == 0 or location == 4:
            return 0
        elif location == 1 or location == 3:
            return 1 * power + crystalSquaresatX(m - 1, x % power)
        elif location == 2:
            return 2 * power + crystalSquaresatX(m - 1, x % power)
        return maxheightatx
    return 0

*/
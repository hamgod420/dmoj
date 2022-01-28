/**
 * 
 */
package codingclass;

import java.util.*;

/**
 * @author hamgod
 *
 */
public class dmopc14c3p4 {

	/**
	 * @param args
	 */
	static void SieveOfEratosthenes(int n, boolean prime[], boolean primesquare[], int a[]) {
		for (int i = 2; i <= n; i++)
			prime[i] = true;
		for (int i = 0; i < ((n * n) + 1); i++)
			primesquare[i] = false;
		prime[1] = false;

		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				for (int i = p * 2; i <= n; i += p)
					prime[i] = false;
			}
		}
		int j = 0;
		for (int p = 2; p <= n; p++) {
			if (prime[p]) {
				a[j] = p;
				primesquare[p * p] = true;
				j++;
			}
		}
	}
	static int countDivisors(int n) {
		if (n == 1)
			return 1;

		boolean prime[] = new boolean[n + 1];
		boolean primesquare[] = new boolean[(n * n) + 1];
		int a[] = new int[n];
		SieveOfEratosthenes(n, prime, primesquare, a);
		int ans = 1;
		for (int i = 0;; i++) {
			if (a[i] * a[i] * a[i] > n)
				break;
			int cnt = 1;
			while (n % a[i] == 0) {
				n = n / a[i];
				cnt = cnt + 1;
			}
			ans = ans * cnt;
		}
		if (prime[n])
			ans = ans * 2;
		else if (primesquare[n])
			ans = ans * 3;
		else if (n != 1)
			ans = ans * 4;

		return ans; 
	}

	public static int calc(int k, int a, int b) {
		int ans = 0;
		for (int i = a; i <= b; i++) {
			if (countDivisors(i) == k) {
				ans++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		while (N-- > 0) {
			int K = in.nextInt();
			int A = in.nextInt();
			int B = in.nextInt();
			System.out.println(calc(K, A, B));
		}
	}

}

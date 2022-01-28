/**
 * 
 */
package codingclass;

import java.util.*;
/**
 * @author hamgod
 *
 */
public class ccc12s3 {

	/**
	 * @param args
	 */
	public static class countComp implements Comparator<int[]> 
    { 
        public int compare(int[] a, int[] b) 
        { 
            if(a[0] > b[0])
                return -1;
            else if(a[0] < b[0])
                return 1;
            else
                return a[1] - b[1]; 
        } 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] aCount = new int[1001][2];
        for(int i = 0; i < 1001; i++)
            aCount[i][1] = i;
        for(int i = 1; i < N; i++)
            aCount[in.nextInt()][0]++;
        Arrays.sort(aCount, new countComp());
        int iAns = 0;
        if(N == 2)
            iAns = Math.abs(aCount[0][1] - aCount[1][1]);
        else
        {
            int iInd;
            if(aCount[0][0] == aCount[1][0])
            {
                iInd = 1;
                for(int i = 2; i < 1001; i++)
                {
                    if(aCount[i][0] != aCount[0][0])
                    {
                        iInd = i - 1;
                        break;
                    }
                }
                iAns = Math.abs(aCount[0][1] - aCount[iInd][1]);
            }
            else if(aCount[1][0] == aCount[2][0])
            {
                iInd = 2;
                for(int i = 3; i < 1001; i++)
                {
                    if(aCount[i][0] != aCount[0][0])
                    {
                        iInd = i - 1;
                        break;
                    }
                }
                iAns = Math.max(Math.abs(aCount[0][1] - aCount[1][1]), Math.abs(aCount[0][1] - aCount[iInd][1]));
            }
            else
                iAns = Math.abs(aCount[0][1] - aCount[1][1]);
        }
        System.out.println(iAns);
		
	}

}

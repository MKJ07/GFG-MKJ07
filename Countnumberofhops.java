public class Countnumberofhops {
    /*This function is the optimal approach storing the value of the calculation and return if its re occur
     * This is DP approach
     */
    static long countWays(int n, long[] arr) {
        int MOD = 1000000007;// It is use for the condition that integer does not get overflow.
        if (n <= 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = (countWays(n - 3, arr)%MOD + countWays(n - 2, arr)%MOD + countWays(n - 1, arr)%MOD)%MOD;
        return arr[n];
    }
    static long countWays(int n)
    {
        /*This is the brute force approach having TC:O(2^n) and SC:O(1) 
        if(n==1 || n==0){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else
            return countWays(n-3)+countWays(n-2)+countWays(n-1);
        */

        /*This is the optimal approach having TC:O(n) and SC:O(n) */
        long[] arr = new long[n + 1];
        return countWays(n, arr);
    }
}

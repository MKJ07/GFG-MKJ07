public class Countnumberofhops {
    // static long cal(int n){
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     else if(n==2){
    //         return 2;
    //     }
    //     else
    //         return cal(n-3)+cal(n-2)+cal(n-1);
    // }
    static long countWays(int n, long[] arr) {
        int MOD = 1000000007;
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
        
        long[] arr = new long[n + 1];
        return countWays(n, arr);
    }
}

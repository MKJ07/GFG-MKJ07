import java.util.HashMap;
/*Question: Longest subarray with sum divisible by K
Link: https://practice.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1

Input:
A[] = {-2, 2, -5, 12, -11, -1, 7}
K = 3
Output: 5
Explanation:
The subarray is {2,-5,12,-11,-1} with
sum -3, which is divisible by 3.
 */
public class LongestsubarraywithsumdivisiblebyK {
    static int longSubarrWthSumDivByK(int arr[], int n, int k)
    {
        // Complete the function
        /*This is the optimize code using TC: O(n) and SC: O(n) */
        int maxlen=0;int sum=0;
        HashMap<Integer,Integer> h1=new HashMap<>();
        h1.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(h1.containsKey(rem)){
                int len=i-h1.get(rem);
                maxlen=Math.max(len,maxlen);
            }
            if(!h1.containsKey(rem)){
                h1.put(rem,i);
            }
        }
        return maxlen;

        /*This is a better approach with TC:O(n^2) and SX: O(1) */
        // int len=0,left=0;
        // while(left<n){
        //     int sum=0;int tl=0;
        //     for(int i=left;i<n;i++){
        //         sum+=arr[i];
        //         if(sum%k==0){
        //             tl=Math.max(i-left+1,tl);
        //         }
        //     }
        //     len=Math.max(len,tl);
        //     left++;
        // }
        // return len;
    }
    public static void main(String[] args) {
        int A[] = {2, 7, 6, 1, 4, 5};
        int K = 3;
        System.out.println(longSubarrWthSumDivByK(A, A.length, K));
    }
}

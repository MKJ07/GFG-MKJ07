import java.util.ArrayList;
/*Question: Max Sum Subarray of size K.
Link: https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

Input:
N = 4, K = 4
Arr = [100, 200, 300, 400]
Output:
1000
Explanation:
Arr1 + Arr2 + Arr3 + Arr4 =1000,
which is maximum.
*/
public class MaxSumSubarrayofsizeK {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        /*This is the brute force approach having T O(N+K) and SC: O(1) */
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            int sum=0;
            int j=i,cnt=0;
            while(cnt<K && j<N){
                sum+=Arr.get(j);
                cnt++;j++;
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int N = arr.size();
        int K = 3;

        long result = maximumSumSubarray(K, arr, N);
        System.out.println("Maximum Sum Subarray: " + result);
    }
}

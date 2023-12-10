/*Question: Subarray with 0 sum.
Link: https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1

Input:
n = 5
arr = {4,2,0,1,6}
Output: 
Yes
Explanation: 
0 is one of the element in the array so there exist a subarray with sum 0.
*/
public class Subarraywith0sum {
    static boolean findsum(int arr[],int n)
    {
        /*This is the brute force approach having TC: O(N^2) and SC: O(1) */
        for(int ele: arr){
            if(ele==0)
                return true;
        }
        for(int i=0;i<n;i++){
            int sum=0;
            sum+=arr[i];
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                if(sum==0){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {2, 4, -6, 1, 3, -5, 7},
            {1, 5, 6,8, 4, 4},
            {5, 0, -5, 2, -2, 3, -3},
            {1, 2, 5, 6, 7, 8, -6},
            {10, -5, 5, 5, -5, 10},
            {-1, -2, -3, 6},
            {8, 8},
            {-4, 2, 1, -2, 3},
            {-3, 1, 2, -4, 2, 3, -1},
            {6, -6, 6, -6, 6, -6}
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean result = findsum(testCases[i], testCases[i].length);
            System.out.println("Test Case " + (i + 1) + ": " + result);
        }
    }
}

/*Question: Maximum Index.
Link: https://www.geeksforgeeks.org/problems/maximum-index-1587115620/1

Example 1:
Input:
n = 2
a[] = {1, 10}
Output:
1
Explanation:
a[0] < a[1] so (j-i) is 1-0 = 1.

Example 2:
Input:
n = 9
a[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output:
6
Explanation:
In the given array a[1] < a[7] satisfying the required condition(a[i] < a[j]) thus giving the maximum difference of j - i which is 6(7-1).
*/
public class MaximumIndex {
    static int maxIndexDiff(int a[], int n) {
        /* This is the optimal approach having TC: O(n) and SC: O(2n) */
        int[] left = new int[n];
        left[0] = a[0];
        int[] right = new int[n];
        right[n - 1] = a[n - 1];
        for (int i = 1; i < n; i++) {
            left[i] = Math.min(left[i - 1], a[i]);
        }
        for (int j = n - 2; j >= 0; j--) {
            right[j] = Math.max(right[j + 1], a[j]);
        }
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (left[i] <= right[j]) {
                int t = j - i;
                max = Math.max(max, t);
                j++;
            } else {
                i++;
            }
        }

        /*
         * This is a better approach having TC: O(~n) and SC: O(1)
         * int max=Integer.MIN_VALUE;
         * int left=0,right=n-1;
         * while(left<=right){
         * if(a[left]<=a[right]){
         * int temp=right-left;
         * max=Math.max(max,temp);
         * left++;
         * right=n-1;
         * }
         * else{
         * right--;
         * }
         * }
         */

        /*
         * This is the brute force approach having TC: O(n^2) and SC: O(1)
         * int max=Integer.MIN_VALUE;
         * for(int i=0;i<n;i++){
         * for(int j=0;j<n;j++){
         * if(a[i]<=a[j] && i<j){
         * int temp=j-i;
         * max=Math.max(max,temp);
         * }
         * }
         * }
         */
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 34, 5, 4, 8, 25, 1, 4, 56, 8, 45, 2 };
        int n = arr.length;
        System.out.println(maxIndexDiff(arr, n));
    }
}

/*Question: Find the closest number.
Link: https://www.geeksforgeeks.org/problems/find-the-closest-number5513/1

Example 1:
Input: 
n = 4
k = 4
arr[] = {1, 3, 6, 7}
Output: 
3
Explanation:
We have array arr={1, 3, 6, 7} and target is 4. If we look at the absolute difference of target with every element of the array we will get { |1-4|, |3-4|, |6-4|, |7-4| }  = {3, 1, 2, 3}. So, the closest number is 3.

Example 2:
Input:
n = 7
k = 4
arr[] = {1, 2, 3, 5, 6, 8, 9}
Output:
5
Explanation:
The absolute difference of 4 is 1 from both 3 and 5. According to the question, we have to return greater value, which is 5.
*/
public class Find_the_closest_number {
    public static int findClosest(int n, int k, int[] arr) {
        /*This is the optimal approach having TC: O(log N) and SC: O(1) { N: length of the array } */
        int low = 0;
        int high = arr.length - 1;
        int closestValue = arr[0];
        int minDiff = Math.abs(arr[0] - k);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = arr[mid];
            int diff = Math.abs(midValue - k);
            if (diff < minDiff || (diff == minDiff && midValue > closestValue)) {
                closestValue = midValue;
                minDiff = diff;
            }
            if (midValue < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return closestValue;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 5, 6, 8, 12, 14, 16, 16, 19};
        int k = 10;
        int n=arr.length;
        System.out.println(findClosest(n,k,arr));
    }
    
}

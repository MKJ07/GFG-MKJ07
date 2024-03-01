/*Question: Peak element.
Link: https://www.geeksforgeeks.org/problems/peak-element/1

Example 1:
Input: 
n = 3
arr[] = {1, 2, 3}
Peak element's index: 2
Output: 
1
Explanation: 
If the index returned is 2, then the output printed will be 1. Since arr[2] = 3 is greater than its adjacent elements, and there is no element after it, we can consider it as a peak element. No other index satisfies the same property.

Example 2:
Input:
n = 7
arr[] = {1, 1, 1, 2, 1, 1, 1}
Output: 
1
Explanation: 
In this case there are 5 peak elements with indices as {0,1,3,5,6}. Returning any of them will give you correct answer.*/
public class PeakElement {
    public int peakElement(int[] a, int n) {
        /*This appraoch has overall TC: O(n) and SC: O(1) {n: length of the array} */
        if (n == 1)
            return 0;
        if (a[0] >= a[1])
            return 0;
        if (a[n - 1] >= a[n - 2])
            return n - 1;

        for (int i = 1; i < n - 1; i++) {
            if (a[i] >= a[i - 1] && a[i] >= a[i + 1])
                return i;
        }
        return 0;

    }

    public static void main(String[] args) {
        PeakElement obj = new PeakElement();
        int[] arr = { 100000, 500000, 750000, 200000, 300000 };
        int n = arr.length;
        System.out.println(obj.peakElement(arr, n));
    }
}

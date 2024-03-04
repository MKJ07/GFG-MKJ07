/*Question: Swap the array elements.
Link: https://www.geeksforgeeks.org/problems/need-some-change/1

Example 1:
Input:
n = 3
arr[] = 1 2 3
Output:
3 2 1
Explanation:
Swapping 1 and 3, makes the array 3 2 1. There is only one swap possible in this array.

Example 2:
Input:
n = 5
arr[] = 1 2 3 4 5
Output:
3 4 5 2 1
Explanation:
Swapping 1 and 3, makes the array 3 2 1 4 5.
Now, swapping 2 and 4, makes the array 3 4 1 2 5. 
Again,swapping 1 and 5, makes the array 3 4 5 2 1.
*/
public class Swapthearrayelements {
    public void swapElements(int[] arr, int n) {
        /* This approach has TC: O(n) and SC: O(1) */
        int i = 0;
        while (i < n - 2) {
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 8, 7, 6, 3, 2, 5, 8, 8 };
        int n = arr.length;
        Swapthearrayelements obj = new Swapthearrayelements();
        obj.swapElements(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

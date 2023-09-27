import java.util.ArrayList;

/*Question: Find the closest pair from two arrays.
Link: https://practice.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1

Input:
N = 5, M = 5
Array A[] = {1, 3, 5, 7, 9}
Array B[] = {2, 4, 6, 8, 10}
X = 18
Output:
The closest pair is: 9 and 8
Explanation:
In this case, we have two sorted arrays, A and B, with N elements each. The values of the arrays are:
A[] = {1, 3, 5, 7, 9}
B[] = {2, 4, 6, 8, 10}
We are given a target value X, which is 18. Our goal is to find the pair of elements (one from A and one from B) whose sum is closest to X.
The closest pair is {9 from A and 8 from B} because 9 + 8 = 17, which is the closest sum to 18 among all possible pairs.
 */
public class FindTheClosestPairFromTwoArray {
    public static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {
        int diff = Integer.MAX_VALUE;
        int res_l = 0, res_r = 0;
        int l = 0, r = m - 1;

        while (l < n && r >= 0) {
            int currentSum = arr[l] + brr[r];
            if (Math.abs(currentSum - x) < diff) {
                res_l = l;
                res_r = r;
                diff = Math.abs(currentSum - x);
            }
            if (currentSum < x) {
                l++;
            } else {
                r--;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[res_l]);
        result.add(brr[res_r]);
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 7 };
        int brr[] = { 10, 20, 30, 40 };
        int x = 38;

        ArrayList<Integer> closestPair = printClosest(arr, brr, arr.length, brr.length, x);

        System.out.println(closestPair.get(0) + " " + closestPair.get(1));
    }

}
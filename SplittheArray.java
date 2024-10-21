/*Question: Split the Array.
Link: https://www.geeksforgeeks.org/problems/split-the-array0238/1

Input : arr[] = [1, 2, 3]
Output : 3
Explanation: 
    {(1),(2, 3)}, {(2),(1, 3)}, {(3),(1, 2)} are three ways with equal XOR value of two groups.

Input : arr[] = [5, 2, 3, 2]
Output : 0
Explanation: 
    No way to split into  two groups whose XOR is equal.
 */

public class SplittheArray {
    public static int countgroup(int arr[]) {
        /*This approach has TC: O(n) and SC: O(1) {n:no of elements in the array} */
        int xor=0,mod=1000000007;
        int n=arr.length;
        for(int i=0;i<n;i++){
            xor^=arr[i];
        }
        int ans=1;
        for(int i=0;i<n-1;i++){
            ans*=2;
            ans%=mod;
        }
        return xor==0? ans-1:0;
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,0};
        System.out.println(countgroup(arr));
    }
}

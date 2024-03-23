/*Question: Fibonacci series up to Nth term.
Link: https://www.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1

Example 1:
Input:
n = 5
Output:
0 1 1 2 3 5
Explanation:
0 1 1 2 3 5 is the Fibonacci series up to the 5th term.

Example 2:
Input:
n = 10
Output:
0 1 1 2 3 5 8 13 21 34 55
Explanation:
0 1 1 2 3 5 8 13 21 34 55 is the Fibonacci series up to the 10th term.
*/
public class FibonacciseriesuptoNthterm {
    int[] Series(int n) {
        /*This is the optimal approach having TC: O(n) and SC: O(n+1) */
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=(arr[i-2]+arr[i-1])%1000000007;
        }
        return arr;
    }
    public static void main(String[] args) {
        FibonacciseriesuptoNthterm obj=new FibonacciseriesuptoNthterm();
        int[] arr=obj.Series(65);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

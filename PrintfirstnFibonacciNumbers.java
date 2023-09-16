/*Question: Print first n Fibonacci Numbers.
Link: https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1

Input:
N = 7
Output: 1 1 2 3 5 8 13
*/

public class PrintfirstnFibonacciNumbers {
    public static long[] printFibb(int n) 
    {
        if(n<=1){
            long[] arr={n};
            return arr;
        }
        long []arr=new long[n];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
    public static void main(String[] args) {
        long[] nums=printFibb(10);
        for (long l : nums) {
            System.out.print(l+" ");
        }
    }
}

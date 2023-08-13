/*Question: Nth Ficonacci Number.
Link: https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1

Input: 
n = 5
Output: 
5
Explanation: 
5 is the 5th number of fibonacci series.
 */
public class Nth_Fibonacci_Number {
    static int nthFibonacci(int n){
        int a=0,b=1;
        int fibnum=0;
        for(int i=2;i<=n;i++){
            fibnum=(a+b)%1000000007;//since the number can be too long it will return a negative so we use modulo here
            a=b;
            b=fibnum;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(nthFibonacci(2556));
    }
}

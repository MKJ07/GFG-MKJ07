/*Question: Generalised Fibonacci numbers.
Link: https://www.geeksforgeeks.org/problems/generalised-fibonacci-numbers1820/1

Example 1:
Input:
a = 3
b = 3
c = 3
n = 3
m = 5
Output:
4
Explanation:
g(1) = 1 and g(2) = 1 
g(3) = 3*g(2) + 3*g(1) + 3 = 3*1 + 3*1 + 3 = 9
We need to return answer modulo 5, so 9%5 = 4, is the answer.

Example 2:
Input:
a = 2
b = 2
c = 2
n = 4
m = 100
Output:
16
Explanation:
g(1) = 1 and g(2) = 1
g(3) = 2*g(2) + 2*g(1) + 2 = 2*1 + 2*1 + 2 = 6
g(4) = 2*g(3) + 2*g(2) + 2  = 2*6 + 2*1 + 2 = 16
We need to return answer modulo 100, so 16%100 = 16, is the answer.*/
public class GeneralisedFibonaccinumbers {
    static long genFibNum(Long a, Long b, Long c, long n, long m) {
        /*This approach is using recursion and has TC: O(2^n) {for large value of n} and TC: O(n) {for small values of n} */
        if (n == 1 || n == 2)
            return 1;
        return (a * genFibNum(a, b, c, n - 1, m) + b * genFibNum(a, b, c, n - 2, m) + c) % m;
    }

    public static void main(String[] args) {
        long a = 7;
        long b = 7;
        long c = 7;
        long n = 10;
        long m = 17;

        long result = genFibNum(a, b, c, n, m);
        System.out.println("Result: " + result);
    }
}

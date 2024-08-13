/*Question: Square root of a number.
Link: https://www.geeksforgeeks.org/problems/square-root/1

Input: 
    n = 5
Output: 
    2
Explanation: 
    Since, 5 is not a perfect square, floor of square_root of 5 is 2.

Input: 
    n = 4
Output: 
    2
Explanation: 
    Since, 4 is a perfect square, so its square root is 2.
*/

public class Squarerootofanumber {
    long floorSqrt(long n) {
        /*This approach has TC: O(1) and SC: O(1) */
        long num=(int)Math.floor(Math.sqrt(n));
        return num;
    }
    public static void main(String[] args) {
        Squarerootofanumber obj=new Squarerootofanumber();
        System.out.println(obj.floorSqrt(58497852));
    }
}

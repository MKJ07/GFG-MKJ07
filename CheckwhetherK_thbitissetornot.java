/*Question: Check whether K-th bit is set or not.
Link: https://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1

Input: 
N = 4
K = 2
Output: 
Yes
Explanation: 
Binary representation of 4 is 100, in which 2nd index bit from LSB is set. So, return true.
 */
public class CheckwhetherK_thbitissetornot {
    static boolean checkKthBit(int n, int k) {
        String s = "";
        while (n > 0) {
            int d = n % 2;
            s += d;
            n /= 2;
        }
        if (s.length() > k) {
            if (s.charAt(k) == '1')
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 1000000000;
        int k = 31;
        System.out.println(checkKthBit(n, k));
    }
}

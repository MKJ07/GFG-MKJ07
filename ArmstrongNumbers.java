/*Question: Armstrong Numbers.
Link: https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

Input:
    n = 153
Output: 
    true
Explanation: 
    153 is an Armstrong number since 13 + 53 + 33 = 153. Hence answer is "true".

Input:
    n = 372
Output: 
    false
Explanation: 
    372 is not an Armstrong number since 33 + 73 + 23 = 378. Hence answer is "false".
*/

public class ArmstrongNumbers {
    static String armstrongNumber(int n) {
        /*This is the optimal approach has TC: O(log₁₀N) and SC: O(1) */
        int temp=n;
        int num=0;
        while(temp>0){
            int d=temp%10;
            num+=Math.pow(d,3);
            temp/=10;
        }
        if(num==n)
            return "true";
        return "false";
    }
    public static void main(String[] args) {
        System.out.println(armstrongNumber(371));
    }
}

/*Question:- Break a number
Link:-https://practice.geeksforgeeks.org/problems/break-a-number5913/1

Input: N = 2
Output: 6
Explanation: Possible ways to break the number:
0 + 0 + 2 = 2, 0 + 2 + 0 = 2, 2 + 0 + 0 = 2, 0 + 1 + 1 = 2, 1 + 1 + 0 = 2, 1 + 0 + 1 = 2.

Input: N = 3
Output: 10
Explanation: Possible ways to break the number:
0+0+3 = 3, 0+3+0 = 3, 3+0+0 = 3, 0+1+2 = 3, 0+2+1 = 3, 1+0+2 = 3, 1+2+0 = 3
2+0+1 = 3, 2+1+0 = 3, 1+1+1 = 3.

The problem gives out that it is sum of natural numbers plus one(s=((N+1)*(N+2))/2)
and because the number becomes too large after the calculation we will go for the modulous of 10^+7 as given 
in the problem.
*/
public class Break_a_number {
    int waysToBreakNumber(int N){
        long l=1000000007;
        int t=(int)(((N+1)%l*(N+2)%l)%l)/2;
        return t;
    }
    public static void main(String[] args) {
        int number=10045;
        Break_a_number t=new Break_a_number();
        System.out.println(t.waysToBreakNumber(number));
    }
}

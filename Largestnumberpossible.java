/*Question: Largest number possible.
Link:https://practice.geeksforgeeks.org/problems/largest-number-possible5028/1

Input: N = 3, S = 20
Output: 992
Explaination: It is the biggest number 
with sum of digits equals to 20.
*/

public class Largestnumberpossible {
    static String findLargest(int N, int sum){
        // code here
        if (N * 9 < sum || (N > 1 && sum == 0)) {
        return "-1";
    }

    StringBuilder ans = new StringBuilder();

    for (int i = 0; i < N; i++) {
        int digit = Math.min(9, sum);
        ans.append(digit);
        sum -= digit;
    }

    return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(findLargest(6, 8));
    }
}

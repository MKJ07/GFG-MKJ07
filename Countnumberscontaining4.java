/*Question: Count numbers containing 4.
Link: https://www.geeksforgeeks.org/problems/count-numbers-containing-43022/1

Input: n = 9
Output: 1
Explanation: 4 is the only number between 1 to 9 which contains 4 as a digit.

Input: n = 44
Output: 9
Explanation: 4, 14, 24, 34, 40, 41, 42, 43 & 44, there are total 9 numbers containing 4 as a digit.
*/
public class Countnumberscontaining4 {
    public static int countNumberswith4(int n) {
        /*This approach has TC: O(nlog(base10)(n)) and SC: O(1) */
        if(n<4)
            return 0;
        int cnt=1;
        for(int i=5;i<=n;i++){
            int num=i;
            int temp=0;
            while(num>0){
                int d=num%10;
                if(d==4){
                    temp++;
                    break;
                }
                num/=10;
            }
            cnt+=temp;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n=56874;
        System.out.println(countNumberswith4(n));
    }
}

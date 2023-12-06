/*Question: How Many X's?.
Link: https://www.geeksforgeeks.org/problems/how-many-xs4514/1

Input:
L=18, R=81, X=9
Output:
7
Explanation:
There are 7 occurrences of the digit 9 in the numbers in the range (18,81).
*/
public class HowManyXs {
    static int countX(int L, int R, int X) {
        /*The code has TC: O(N*M) and SC: O(1) */
        int cnt=0;
        for(int i=L+1;i<R;i++){
            int temp=i;
            while(temp>0){
                int mod=temp%10;
                if(mod==X){
                    cnt++;
                }
                temp/=10;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int L=10,R=19,X=1;
        System.out.println(countX(L, R, X));
    }
}

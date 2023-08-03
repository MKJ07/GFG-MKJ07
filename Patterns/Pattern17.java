package Patterns;
/*Question: Pattern 17
Link:https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285911/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_17

Input: 4
Output:
   A
  ABA
 ABCBA
ABCDCBA
 */
public class Pattern17 {
    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(char k='A';k <='A'+i;k++){
                System.out.print(k);
            }
            for(char l=(char) (65 + i - 1);l>='A';l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle(5);
    }
}

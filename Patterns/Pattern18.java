package Patterns;
/*Question: Pattern 18
Link:https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285911/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_17

Input: 5

Output:
E
E D
E D C
E D C B
E D C B A
 */
public class Pattern18 {
    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            char ch=(char)('A'+n-1);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle(5);
    }
}

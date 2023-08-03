package Patterns;
/*Question: Pattern 14
Link: https://practice.geeksforgeeks.org/problems/triangle-pattern-1662284916/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_14

Input: 5

Output:
A
AB
ABC
ABCD
ABCDE
 */
public class Pattern14 {
    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            int c=65;
            for(int j=0;j<=i;j++){
                char p=(char)c;
                System.out.print(p);
                c++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle(5);
    }
}

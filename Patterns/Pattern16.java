package Patterns;
/*Question: Pattern 16
Link:https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285334/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_16

Input: 5

Output:
A
BB
CCC
DDDD
EEEEE
 */
public class Pattern16 {
    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<=i;j++){
                c=65+i;
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

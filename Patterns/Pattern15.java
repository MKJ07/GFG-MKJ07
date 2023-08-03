package Patterns;
/*Question: Pattern 15
Link:https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285196/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_15

Input: 5

Output:
ABCDE
ABCD
ABC
AB
A
 */
public class Pattern15 {

    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            int c=65;
            for(int j=n-i;j>0;j--){
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

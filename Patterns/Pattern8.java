package Patterns;
/*Question: Pattern 8
Link: https://practice.geeksforgeeks.org/problems/triangle-pattern-1661493231/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_8

Input: 5

Output:

*********
 *******
  *****
   ***
    *
 */
public class Pattern8 {
    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n-i;k>0;k--){
                System.out.print("*");
            }
            for(int l=n-i-1;l>0;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle(5);
    }
    
}

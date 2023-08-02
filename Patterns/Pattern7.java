package Patterns;
/*Question: Pattern 7
Link: https://practice.geeksforgeeks.org/problems/triangle-pattern-1661492263/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_7

Input: 5

Output:
    *
   ***  
  *****
 *******
*********
 */
public class Pattern7 {
    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle(5);
    }
}

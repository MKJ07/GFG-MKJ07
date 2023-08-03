package Patterns;
/*Question: Pattern 20
Link:https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662287416/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_20

Input: 5

Output:
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */
public class Pattern20 {
    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("+");
            }
            for(int k=0;k<n-i-1;k++){
                System.out.print("  ");
            }
            for(int l=0;l<=i;l++){
                System.out.print("+");
            }
            
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print("+");
            }
            for(int k=0;k<=i;k++){
                System.out.print("  ");
            }
            for(int l=0;l<n-i-1;l++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle(5);
    }
}

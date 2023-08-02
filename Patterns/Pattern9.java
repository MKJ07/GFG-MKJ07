package Patterns;
/*Question: Pattern 9
Link: https://practice.geeksforgeeks.org/problems/pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_9

 */
public class Pattern9 {
    static void printDiamond(int n) {
        // Your code here
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n-i;k>0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printDiamond(5);
    }
}

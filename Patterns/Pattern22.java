package Patterns;
/*Question: Pattern 22
Link:https://practice.geeksforgeeks.org/problems/square-pattern-1662666141/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_22

Input: 4

Output:
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
 */
public class Pattern22 {
    static void printSquare(int n) {
        // code here
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int t=i,l=j,r=(2*n-2)-j,b=(2*n-2)-i;
                System.out.print(n-Math.min(Math.min(t,b),Math.min(l,r))+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printSquare(5);
    }
}

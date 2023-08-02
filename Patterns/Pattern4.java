package Patterns;
/*Question: Pattern 4
Link: https://practice.geeksforgeeks.org/problems/triangle-number-1661428795/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_4

Input: 5

Output:
1
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
 */
public class Pattern4 {
    static void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       printTriangle(5); 
    }
}

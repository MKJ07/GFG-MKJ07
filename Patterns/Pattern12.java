package Patterns;
/*Question: Pattern 12
Link: https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662664259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_12

Input: 5

Output:
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
 */
public class Pattern12 {
    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            for(int k=n-i;k>1;k--){
                System.out.print("  ");
            }
            for(int l=n-i;l>1;l--){
                System.out.print("  ");
            }
            for(int m=i+1;m>0;m--){
                System.out.print(m+" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        printTriangle(5);
    }
}

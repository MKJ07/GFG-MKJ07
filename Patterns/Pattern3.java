package Patterns;
/*Question: Pattern 3
Link:https://practice.geeksforgeeks.org/problems/triangle-number/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_3  
 
Input: 5

Output:
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5*/
public class Pattern3 {
    static void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle(5);
    }
}

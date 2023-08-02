package Patterns;
/*Question: Pattern 6
Link: https://practice.geeksforgeeks.org/problems/triangle-number-1661489840/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_6

Input: 5

Output:
1 2 3 4 5
1 2 3 4
1 2 3 
1 2  
1   
 */
public class Pattern6 {
    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=n-i;j>0;j--){
                System.out.print(++c +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle(5);   
    }
}

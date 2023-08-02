package Patterns;
/*Question: Pattern 5
Link: https://practice.geeksforgeeks.org/problems/triangle-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_5

Input: 5

Output:
* * * * *
* * * * 
* * * 
* *  
*
 */
public class Pattern5 {
    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       printTriangle(5); 
    }
    
}

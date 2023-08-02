package Patterns;

/*Question: Pattern 10
Link: https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718013/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_10

Input: 5

Output:
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*
 */

public class Pattern10 {
    static void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle(5);   
    }
    
}
package Patterns;
/*Question: Pattern 13
Link: https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718712/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_13

Input: 5

Output:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
 */
public class Pattern13 {
    static void printTriangle(int n) {
        int c=1;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print(c++ +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       printTriangle(5); 
    }
}

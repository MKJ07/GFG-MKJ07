/*Question:-Carpet into Box
Link:-https://practice.geeksforgeeks.org/problems/230d87552a332a2970b2092451334a007f2b0eec/1
Input: 
A = 8, B = 13
C = 6, D = 10
Output:
Minimum number of moves: 1
Explanation:
Fold the carpet by breadth, 13/2 i.e. 6,so now carpet is 6*8 and can fit fine.

Input:
A = 4, B = 8
C = 3, D = 10
Output:
Minimum number of moves: 1
Explanation: Fold the carpet by length , 4/2 i.e. 2,so now carpet is 2*8 and can fit fine.
*/
public class Carpet_into_Box {
    static int result(int a,int b,int C,int D){
        int c=0;
        while(a>C || b>D ){
	        if(b>D){
	            b/=2;
	            c++;
	        }
	        if(a>C){
	            a/=2;
	            c++;
	        }
	    }
	    return c;
    }
    int carpetBox(int A, int B, int C, int D) { 
        int res1=result(A,B,C,D);
	    int res2=result(B,A,C,D);
	    int res=Math.min(res1,res2);
	    return res;
    }
	public static void main(String[] args) {
        Carpet_into_Box t=new Carpet_into_Box();
	    int A=8,B=13,C=6,D=8;
	    System.out.println(t.carpetBox(A,B,C,D)); 
	}
}

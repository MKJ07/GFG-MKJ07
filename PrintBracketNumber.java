import java.util.*;
/*Question: Print Bracket Number.
Link: https://www.geeksforgeeks.org/problems/print-bracket-number4058/1

Input:  str = "(aa(bdc))p(dee)"
Output: 1 2 2 1 3 3
Explanation: 
    The highlighted brackets in
    the given string (aa(bdc))p(dee) are
    assigned the numbers as: 1 2 2 1 3 3.

Input:  str = "(((()("
Output: 1 2 3 4 4 5
Explanation: 
    The highlighted brackets in
    the given string (((()( are assigned
    the numbers as: 1 2 3 4 4 5
*/

public class PrintBracketNumber {
    ArrayList<Integer> bracketNumbers(String str) {
        /*This is the optimal approach having TC: O(n) and SC: O(n) {n: length of the string} */
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> a1=new ArrayList<>();
        int cnt=0,n=str.length();
        for(int i=0;i<n;i++){
            if(!st.isEmpty() && str.charAt(i)==')'){
                a1.add(st.pop());
            }
            else if(str.charAt(i)=='('){
                cnt++;
                st.push(cnt);
                a1.add(cnt);
            }
        }
        return a1;
    }
    public static void main(String[] args) {
        String str="(mahes(nahrdD))jshuitr(dhhdued(((njnside)))njsc)";
        PrintBracketNumber obj=new PrintBracketNumber();
        System.out.println(obj.bracketNumbers(str));
    }
}

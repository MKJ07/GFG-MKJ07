import java.util.*;
/*Question: Parenthesis Checker.
Link:-https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1

Input: {([])}
Output: true
Explanation: { ( [ ] ) }. Same colored brackets can form balanced pairs, with 0 number of unbalanced bracket.

Input: ([]
Output: false
Explanation: ([]. Here square bracket is balanced but the small bracket is not balanced and Hence , the output will be unbalanced.
*/
public class Parenthesis_Checker {
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<x.length();i++){
            if(st.isEmpty()){
                st.push(x.charAt(i));
            }
            else if(x.charAt(i)==')'){
                if(st.peek()!='('){
                    return false;
                }
                else{
                   st.pop(); 
                } 
            }
            else if(x.charAt(i)==']'){
                if(st.peek()!='['){
                    return false;
                }
                else{
                   st.pop(); 
                } 
            }
            else if(x.charAt(i)=='}'){
                if(st.peek()!='{'){
                    return false;
                }
                else{
                   st.pop(); 
                } 
            }
            else{
                st.push(x.charAt(i));
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="(({{[]}}))";
        System.out.println(ispar(s));

    }
    
}

import java.util.*;
/*S = aabb
Output:  ab  */
public class Remove_Consecutive_Characters {
    public static void main(String[] args) {
        String S="aabbaa";
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(!st.isEmpty() && st.peek() == S.charAt(i)){
                continue;
                
            }
            else{
                st.push(S.charAt(i));
                
            }
            
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        String s1=sb.reverse().toString();
        System.out.println(s1);
    }
    
}

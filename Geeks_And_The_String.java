import java.util.*;
/*Question:- Geeks And The String
Link:-https://practice.geeksforgeeks.org/problems/466faca80c3e86f13880710491c634d26abd44a7/1

Input: aaabbaaccd
Output: ad
Explanation: Remove (aa)abbaaccd =>abbaaccd
Remove a(bb)aaccd => aaaccd
Remove (aa)accd => accd
Remove a(cc)d => ad

Input: aaaa
Output: Empty String
Explanation: Remove (aa)aa => aa
Again removing pair of duplicates then (aa) will be removed and we will get 'Empty String'.
*/
public class Geeks_And_The_String {
    public static String removePair(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        if(st.isEmpty()){
            return "-1";
        }
        StringBuilder s1=new StringBuilder();
        
        while(!st.isEmpty()){
            s1.append(st.peek());
            st.pop();
        }
        s1.reverse();
        String res=s1.toString();
        return res;
    }
    public static void main(String[] args) {
        String s="aaabbaaccd";
        System.out.println(removePair(s));

    }
}

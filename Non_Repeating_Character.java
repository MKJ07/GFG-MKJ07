import java.util.HashMap;
/*Question :Non Repeating Character
Link :https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.

Input:
S = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is
the character which is non-repeating.
  */
public class Non_Repeating_Character {
    static char nonrepeatingCharacter(String s)
    {
        //Your code here
       HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
            }
            else{
                h.put(s.charAt(i),1);
            }
            
        }
        for(int i=0;i<s.length();i++){
            if(h.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        System.out.println(nonrepeatingCharacter("hhghgfrtrtfggjvggvgffffddsruy"));
    }
}

import java.util.HashMap;
/*Question: Isomorphic Strings
Link: https://www.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1

Input:
str1 = aab
str2 = xxy
Output: 
1
Explanation: 
There are two different characters in aab and xxy, i.e a and b with frequency 2 and 1 respectively.
*/
public class IsomorphicStrings {
    public static boolean areIsomorphic(String str1,String str2)
    {
        int n1=str1.length();
        int n2=str2.length();
        if(n1!=n2){
            return false;
        }
        HashMap<Character,Character> h1=new HashMap<>();
        for(int i=0;i<n1;i++){
            if(h1.containsKey(str1.charAt(i))){
                if(str2.charAt(i)!=h1.get(str1.charAt(i))){
                    return false;
                }
            }
            else if(h1.containsValue(str2.charAt(i))){
                for(char k: h1.keySet()){
                    if(h1.get(k)==str2.charAt(i)){
                        if(k!=str1.charAt(i))
                            return false;
                    }
                }
            }
            else{
                h1.put(str1.charAt(i),str2.charAt(i));
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        String s1="aabbbcc032";
        String s2="xxyyyzz123";
        System.out.println(areIsomorphic(s1, s2));
    }
}

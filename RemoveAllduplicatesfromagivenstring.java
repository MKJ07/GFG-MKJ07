import java.util.HashMap;
/*Question: Remove all duplicates from a given string.
Link: https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1

Example 1:
Input:
str = "geEksforGEeks"
Output: 
"geEksforG"
Explanation: 
After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".

Example 2:
Input:
str = "HaPpyNewYear"
Output: 
"HaPpyNewYr"
Explanation: 
After removing duplicate characters such as e, a, we have string as "HaPpyNewYr".
*/
public class RemoveAllduplicatesfromagivenstring {
    static String removeDuplicates(String str) {
        /*This is optimal approach having TC: O(n) and SC: O(n) {n: length of the String} */
        String s="";
        HashMap<Character,Integer> h1=new HashMap<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(h1.containsKey(ch)){
                h1.put(ch,h1.get(ch)+1);
            }
            else{
                h1.put(ch,1);
                s+=ch;
            }
        }
        return s;
    }
    public static void main(String[] args) {
      String str="IamaProudCitizenofmylovelyCountryIndia";
      System.out.println(removeDuplicates(str));  
    }
}

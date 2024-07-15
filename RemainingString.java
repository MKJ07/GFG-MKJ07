/*Question: Remaining String.
Link: https://www.geeksforgeeks.org/problems/remaining-string3515/1

Input: s = "Thisisdemostring", ch = 'i', count = 3
Output: ng
Explanation: 
    The remaining substring of s after the 3rd
    occurrence of 'i' is "ng", hence the output is ng.

Input: s = "Thisisdemostri", ch = 'i', count = 3
Output: " "
Explanation: 
    The 3rd occurence of 'i' is at the last index. In this case the remaining substring is empty,
    hence we return empty string.

Input: s = "abcd", ch = 'x', count = 2
Output: " "
Explanation: 
    The character x is not present in the string, hence we return empty string.
*/

public class RemainingString {
    public String printString(String s, char ch, int count) {
        /*This approach has TC: O(n) and SC: O(n) {n: length of the string } */
        int i=0;
        String res="";
        int n=s.length();
        while(i<n && count>0){
            if(s.charAt(i)==ch){
                i++;
                count--;
            }
            else{
                i++;
            }
        }
        while(i<n){
            res+=s.charAt(i);
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        String s="nkjcjdahsannhakjiiu";
        int count=3;char ch='a';
        RemainingString obj=new RemainingString();
        System.out.println(obj.printString(s, ch, count));
    }
}


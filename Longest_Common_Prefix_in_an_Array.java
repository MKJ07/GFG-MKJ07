/*Code Link:-https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1
Input: N = 4
arr[] = {geeksforgeeks, geeks, geek,geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings.

Input: N = 2
arr[] = {hello, world}
Output: -1
Explanation: There's no common prefix
in the given strings.
*/
public class Longest_Common_Prefix_in_an_Array {
    String longestCommonPrefix(String arr[], int n){
        int maxsize=Integer.MAX_VALUE;
        String s="";
        for(int i=0;i<n;i++){
            maxsize=Math.min(maxsize,arr[i].length());
        }
        if(arr.length==1)
            return arr[0];
        for(int i=0;i<maxsize;i++){
            String s1="";
            int ct=0;
            for(int j=1;j<n;j++){
                if(arr[j-1].charAt(i)!=arr[j].charAt(i)){
                    s1="";
                    break;
                }
                else
                    s1=Character.toString(arr[j-1].charAt(i));

                
            }
            
            s+=s1;
            if(s.isEmpty()){
                return "-1";
            }
        }
        
        return s;
    public static void main(String[] args) {
        String[] arr={"geeksforgeeks", "geeks", "geek","geezer"};
        int N =arr.length;
        Longest_Common_Prefix_in_an_Array t=new Longest_Common_Prefix_in_an_Array();
        System.out.println(t.longestCommonPrefix(arr, N));
    }
}

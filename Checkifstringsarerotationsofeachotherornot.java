/*Question: Check if strings are rotations of each other or not.
Link: https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1

Input:
geeksforgeeks
forgeeksgeeks
Output: 
1
Explanation: s1 is geeksforgeeks, s2 is
forgeeksgeeks. Clearly, s2 is a rotated
version of s1 as s2 can be obtained by
left-rotating s1 by 5 units.*/
public class Checkifstringsarerotationsofeachotherornot {
    public static String rotateRight(String str) {
        if (str.length() < 1) {
            return str;
        }
        String lastTwo = str.substring(str.length() - 1);
        String rotatedString = lastTwo + str.substring(0, str.length() - 1);
        return rotatedString;
    }

    public static boolean areRotations(String s1, String s2) {
        /*This code has TC: O(1) and SC: O(s1) */
        if (s1.length() != s2.length()) {
            return false;
        }

        String concatenated = s1 + s1;
        return concatenated.contains(s2);
        /*
         * The time complexity of the rotateRight method is O(n).
         * The time complexity of the areRotations method is O(n^2).
         * The space complexity of both methods is O(n).
         
         * String temp=s1;
         * for(int i=0;i<s1.length();i++){
         * temp=rotateRight(temp);
         * if(s2.equals(temp)){
         * return true;
         * }
         * }
         * return false;
         */
    }
    public static void main(String[] args) {
        String s1="mahesh";
        String s2="eshmah";
        System.out.println(areRotations(s1, s2));
    }
}

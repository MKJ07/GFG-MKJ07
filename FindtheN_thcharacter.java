/*Question: Find the N-th character.
Link: https://www.geeksforgeeks.org/problems/find-the-n-th-character5925/1

Example 1:
Input:
s = "1100"
r = 2
n = 3
Output:
1
Explanation: 
After 1st iteration s becomes "10100101".
After 2nd iteration s becomes "1001100101100110".
Now, we can clearly see that the character at 3rd index is 1, and so the output.

Example 2:
Input:
s = "1010"
r = 1
n = 2
Output:
0
Explanation : 
After 1st iteration s becomes "10011001".
Now, we can clearly see that the character at 2nd index is 0, and so the output.
*/

public class FindtheN_thcharacter {
    static String maniPulate(String s) {
        StringBuilder result = new StringBuilder(s.length() * 2);
        for (char c : s.toCharArray()) {
            result.append(c == '0' ? "01" : "10");
        }
        return result.toString();
    }

    public static char nthCharacter(String s, int r, int n) {
        String t = s;
        /*This approach has TC: O(r*n) and SC: O(n*r) {n: length of the string, r: no of iterations}*/
        for (int i = 0; i < r; i++) {
            t = maniPulate(t);
        }
        return t.charAt(n);

    }

    public static void main(String[] args) {
        String s = "1110101";
        int n = s.length();
        System.out.println(nthCharacter(s, 3, n));
    }

}

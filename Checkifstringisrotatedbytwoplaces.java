/*Question: Check if string is rotated by two places.
Link: https://www.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1

Input:
a = geeksforgeeks
b = geeksgeeksfor
Output: 
0
Explanation: 
If we rotate geeksforgeeks by two place in any direction, we won't get geeksgeeksfor.
*/
public class Checkifstringisrotatedbytwoplaces {
    public static String rotateRight(String str) {
        if (str.length() < 2) {
            return str;
        }
        String lastTwo = str.substring(str.length() - 2);
        String rotatedString = lastTwo + str.substring(0, str.length() - 2);
        return rotatedString;
    }

    public static String rotateLeft(String str) {
        if (str.length() < 2) {
            return str;
        }
        String firstTwo = str.substring(0, 2); 
        String rotatedString = str.substring(2) + firstTwo;
        return rotatedString;
    }
    public static boolean isRotated(String str1, String str2)
    {
        String ls=rotateLeft(str1);
        String rs=rotateRight(str1);
        if(ls.equals(str2) || rs.equals(str2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2="lloWorldHe";
        System.out.println(isRotated(str1, str2));
    }
}

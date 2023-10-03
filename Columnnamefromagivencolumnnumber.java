/*Question: Column name from a given column number.
Link: https://practice.geeksforgeeks.org/problems/column-name-from-a-given-column-number4244/1

Input: 
N = 13
Output: M
Explanation: M is the 13th character of
alphabet.
*/
public class Columnnamefromagivencolumnnumber {
    static String colName (long n)
    {
        StringBuilder s1=new StringBuilder();
        while (n > 0) {
            n--; 
            char s = (char) ('A' + n % 26); 
            s1.append(s);
            n /= 26;
        }
        s1.reverse();
        return s1.toString();
        
    }
    public static void main(String[] args) {
        long n=526;
        System.out.println(colName(n));
    }
}

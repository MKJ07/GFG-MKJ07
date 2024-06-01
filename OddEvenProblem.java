import java.util.HashMap;
import java.util.Map;
/*Question: Odd Even Problem.
Link: https://www.geeksforgeeks.org/problems/help-nobita0532/1

Example 1:
Input: 
    s = "abbbcc"
Output: 
    ODD
Explanation: 
    x = 0 and y = 1 so (x + y) is ODD. 'a' occupies 1st place(odd) in english alphabets and its frequency is odd(1), 
    'b' occupies 2nd place(even) but its frequency is odd(3) so it doesn't get counted and 'c' occupies 3rd place(odd)
    but its frequency is even(2) so it also doesn't get counted.

Example 2:
Input: 
    s = "nobitaa"
Output: 
    EVEN
Explanation: 
    Here n, b, t & a would not count since doesn't match with the even condition
    but o & i will be counted as it satisfies the odd conditions 
    so x = 0 and y = 2 so (x + y) is EVEN.
*/
public class OddEvenProblem {
    public static String oddEven(String s) {
        /*This approach has TC: O(n) and SC: O(n) { n: length of the string } */
        HashMap<Character,Integer> h1=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(h1.containsKey(c))
                h1.put(c,h1.get(c)+1);
            else
                h1.put(c,1);
        }
        int x=0,y=0;
        for (Map.Entry<Character, Integer> map : h1.entrySet()) {
            int c=(int)map.getKey();
            if(c%2==0 && map.getValue()%2==0)
                x+=1;
            else if(c%2!=0 && map.getValue()%2!=0)
                y+=1;
        }
        if((x+y)%2==0)
            return "EVEN";
        return "ODD";
    }
    public static void main(String[] args) {
        String s="amhjtsaadf";
        System.out.println(oddEven(s));
    }
}

import java.util.HashMap;
/*Question: Roman Number to Integer.
Link: https://practice.geeksforgeeks.org/problems/roman-number-to-integer3201/1

Input:
s = III 
Output: 3
*/
public class RomanNumbertoInteger {
    public int romanToDecimal(String s) {
        HashMap<Character,Integer> h1=new HashMap<>();
        h1.put('I',1);
        h1.put('V',5);
        h1.put('X',10);
        h1.put('L',50);
        h1.put('C',100);
        h1.put('D',500);
        h1.put('M',1000);
        int res=h1.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(h1.get(s.charAt(i))<h1.get(s.charAt(i+1))){
                res-=h1.get(s.charAt(i));
            }
            else{
                res+=h1.get(s.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RomanNumbertoInteger t= new RomanNumbertoInteger();
        String s="MDIVCL";
        System.out.println(t.romanToDecimal(s));

    }

}

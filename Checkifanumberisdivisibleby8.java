/*Question: Check if a number is divisible by 8.
Link: https://www.geeksforgeeks.org/problems/check-if-a-number-is-divisible-by-83957/1

Input:
s = "16"
Output:
1
Explanation:
The given number is divisible by 8,
so the driver code prints 1 as the output.

Input:
s = "54141111648421214584416464555"
Output:
-1
Explanation:
Given Number is not divisible by 8, 
so the driver code prints -1 as the output.
*/
public class Checkifanumberisdivisibleby8 {
    int DivisibleByEight(String s){
        /*This approach has TC: O(n) and SC: O(1) {n: length of the String} */
        int n=s.length();
        long num=0;
        for(int i=0;i<n;i++){
            num=num*10+(s.charAt(i)-'0');
        }
        
        if(num%8==0)
            return 1;
        else
            return -1;
    }
    public static void main(String[] args) {
        String s="25468448755266469";
        Checkifanumberisdivisibleby8 obj=new Checkifanumberisdivisibleby8();
        System.out.println(obj.DivisibleByEight(s));
    }
}
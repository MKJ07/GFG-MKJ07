import java.util.Scanner;
/*Question: Power of 2.
Link: https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1

Input: 
N = 98
Output: 
NO
Explanation: 
98 cannot be obtained by any power of 2.
 */
public class Powerof2 {
    public static boolean isPowerofTwo(long n){
        
        double num=0;
        int i=0;
        while(num<=n && i<=n){
            num=Math.pow(2,i);
            if(num==n){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(isPowerofTwo(n));
        sc.close();
    }
}

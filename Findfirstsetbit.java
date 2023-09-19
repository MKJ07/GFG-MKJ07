import java.util.Scanner;
/*Question: Find first set of bit.
Link: https://practice.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1

Input: 
N = 12 
Output: 
3 
Explanation: 
Binary representation of  12 is 1100, the first set bit from the right side is at position 3.
 */
public class Findfirstsetbit {
    public static int getFirstSetBit(int n){
        int idx=0;
        while(n>0){
            int mod=n%2;
            idx++;
            if(mod==1){
                return idx;
            }
            n/=2;
        }
        return idx;
            
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getFirstSetBit(n));
        sc.close();
    }
}

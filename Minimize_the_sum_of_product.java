import java.util.*;
/*Question: Minimize the sum of product.
Link:-https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1

Input: N = 3, A[] = {3, 1, 1}, B[] = {6, 5, 4}.
Output: 23 
Explanation: 1*6+1*5+3*4 = 6+5+12= 23 is the minimum sum.

Input: N = 5, A[] = {6, 1, 9, 5, 4}, B[] = {3, 4, 8, 2, 4}.
Output: 80
Explanation: 2*9+3*6+4*5+4*4+8*1= 18+18+20+16+8= 80 is the minimum sum.
*/
public class Minimize_the_sum_of_product {
    public long minValue(long a[], long b[], long n){
        long sum=0;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=(int)n-1;
        while(i<n){
            sum+=(a[i]*b[j]);
            i++;j--;
        }
        return sum;
    }
    public static void main(String[] args) {
        long A[] = {3, 1, 1}, B[] = {6, 5, 4};
        long n=3;
        Minimize_the_sum_of_product t=new Minimize_the_sum_of_product();
        System.out.println(t.minValue(A, B, n));

    }
    
}

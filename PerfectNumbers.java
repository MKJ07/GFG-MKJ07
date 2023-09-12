/*Question: Perfect Numbers.
Link: https://practice.geeksforgeeks.org/problems/perfect-numbers3207/1

Input:
N = 6
Output:
1 
Explanation:
Factors of 6 are 1, 2, 3 and 6.Excluding 6 their sum is 6 which
is equal to N itself. So, it's aPerfect Number.*/
public class PerfectNumbers {
    static int isPerfectNumber(long N) {
        if(N<=1){
            return 0;
        }
        long sum=1;
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){
                sum+=i;
                if(i!=N/i){
                    sum+=N/i;
                }
            }
        }
        if(sum==N){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(1234));
    }
}

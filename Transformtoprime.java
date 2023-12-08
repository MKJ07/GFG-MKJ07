/*Question: Transform to prime.
Link: https://www.geeksforgeeks.org/problems/transform-to-prime4635/1

Input:
N=3
arr = {1, 5, 7}
Output:  
0 
Explanation: 
The sum of the array is 13 which is already prime.
*/
public class Transformtoprime {
    static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public int minNumber(int arr[], int N)
    {
        /*This approach has TC: O(N + sqrt(sum)) and SC:O(1) */
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(checkPrime(sum))
            return 0;
        boolean isPrime=true;
        int temp=sum;
        while(isPrime){
            temp+=1;
            if(checkPrime(temp)){
                isPrime=false;
                
            }
        }
        return temp-sum;

    }
}

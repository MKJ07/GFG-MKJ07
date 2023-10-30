/*Question: Sum of XOR of all pairs.
Link: https://practice.geeksforgeeks.org/problems/sum-of-xor-of-all-pairs0723/1

Input : arr[ ] = {5, 9, 7, 6} 
Output :  47
Explanation:
All possible pairs and there Xor
Value: (5 ^ 9 = 12) + (5 ^ 7 = 2)
 + (5 ^ 6 = 3) + (9 ^ 7 = 14)
 + (9 ^ 6 = 15) + (7 ^ 6 = 1)
 = 12 + 2 + 3 + 14 + 15 + 1 = 47
 */
public class SumofXORofallpairs {
    public long sumXOR(int arr[], int n) {
        // Initialize the result to 0.
        long result = 0;

        // Iterate through each bit position (0 to 31 for a 32-bit integer).
        for (int i = 0; i < 32; i++) {
            // Initialize counters for the number of 0s and 1s at the current bit position.
            int countZeroes = 0;
            int countOnes = 0;

            // Iterate through the elements in the array.
            for (int j = 0; j < n; j++) {
                // Check if the current bit at position 'i' is 0 or 1 for the element 'arr[j]'.
                if ((arr[j] & (1 << i)) == 0) {
                    // If it's 0, increment the count of 0s.
                    countZeroes++;
                } else {
                    // If it's 1, increment the count of 1s.
                    countOnes++;
                }
            }

            // Calculate the contribution of the current bit position to the XOR sum.
            // Multiply the count of 0s and 1s at this bit position by 2^(i) and add it to
            // the result.
            result += (long) countZeroes * countOnes * (1 << i);
        }

        // The result now contains the sum of XOR operations between all pairs of
        // elements in the array.
        return result;

        /*
         * This is the brute approach having TC:O(N^2) and SC:O() only one test case not
         * passed
         * int i=0;
         * long sum=0;
         * while(i<n-1){
         * int j=i+1;
         * while(j<n){
         * sum+=(arr[i]^arr[j]);
         * j++;
         * 
         * }
         * i++;
         * }
         * return sum;
         */
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 9 };
        int n = arr.length;
        SumofXORofallpairs obj = new SumofXORofallpairs();
        System.out.println(obj.sumXOR(arr, n));
    }
}

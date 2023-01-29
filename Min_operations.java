/*Question:- Min Operations.
Link:-https://practice.geeksforgeeks.org/problems/5a7e1a52f1b7796238f9efea4c6fda389f26c327/1
Input: a = 5, b = 12
Output: 2
Explanantion: In first operation replace a = a&4 = 4 after that replace b = b&6 = 4
Hence both are same after applying two operations.

Input: a = 100, b = 100
Output: 0
Explanation: Already same.
 */
public class Min_operations {
    public static int solve(int a, int b) {
        // code here
        if(a==b){
            return 0;
        }
        if((a&b) == Math.min(a,b)){
            return 1;
        }
        if((a&b)>=0 && (a&b)<Math.min(a,b)){
            return 2;
        }
        return 0;
        // return 2;
    }
    public static void main(String[] args) {
        int a=5,b=12;
        System.out.println(solve(a, b));

    }
}

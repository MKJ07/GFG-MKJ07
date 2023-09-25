import java.util.*;
/*Question: Maximum Sum Combination.
Link: https://practice.geeksforgeeks.org/problems/maximum-sum-combination/1

Input:
N = 4
K = 3
A [ ] = {1, 4, 2, 3}
B [ ] = {2, 5, 1, 6}
Output: {10, 9, 9}
Explanation: 
10 -> (A : 4) + (B : 6)
9 -> (A : 4) + (B : 5)
9 -> (A : 3) + (B : 6)
 */

public class MaximumSumCombination {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int x=A[i]+B[j];
                list.add(x);
            }
        }
        int n=list.size();
        Collections.sort(list);
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<K;i++){
            res.add(list.get(n-i-1));
        }
        return res;
        
    }
    public static void main(String[] args) {
        int N = 2,K = 2;
        int A[ ] = {3, 2},B [ ] = {1, 4};
        System.out.println(maxCombinations(N, K, A, B));

    }
}

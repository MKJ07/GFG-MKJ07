import java.util.*;
/*Ouestion:-Minimize the sum
Link:-https://practice.geeksforgeeks.org/problems/86e609332c9ef4f6b8aa79db11a6c0808c4a1bca/1
Input:N = 4 arr[] = {1, 4, 7, 10}
Output: 39
Explanation: Choose 1 and 4, Sum = 1 + 4 = 5. arr[] = {5, 7, 10} 
Choose 5 and 7, Sum = 5 + (5 + 7) = 17. arr[] = {12, 10} 
Choose 12 and 10, Sum = 17 + (12 + 10) = 39. arr[] = {22}

Input: N = 5 arr[] = {1, 3, 7, 5, 6}
Output: 48
*/
public class Minimize_the_sum {
    long minimizeSum(int N, int arr[]) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<N;i++){
            pq.add(arr[i]);
        }
        int sum=0,res=0;
        while(pq.size()>1){
            int fir=pq.peek();
            pq.poll();
            int sec=pq.peek();
            pq.poll();
            sum=(fir+sec);
            pq.add(sum);
            res+=sum;
        }
        return res;
    }
    public static void main(String[] args) {
        Minimize_the_sum t=new Minimize_the_sum();
        int[] arr={1, 4, 7, 10};
        int N=arr.length;
        System.out.println(t.minimizeSum(N, arr));
    }
}

import java.util.PriorityQueue;
/*Question: Minimum Cost of ropes.
Link: https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1

Input: arr[] = [4, 3, 2, 6]
Output: 29
Explanation: 
    We can connect the ropes in following ways.
    1) First connect ropes of lengths 2 and 3. Which makes the array [4, 5, 6]. Cost of this operation 2 + 3 = 5. 
    2) Now connect ropes of lengths 4 and 5. Which makes the array [9, 6]. Cost of this operation 4 + 5 = 9.
    3) Finally connect the two ropes and all ropes have connected. Cost of this operation 9 + 6 =15
    Total cost for connecting all ropes is 5 + 9 + 15 = 29. This is the optimized cost for connecting ropes. 
    Other ways of connecting ropes would always have same or more cost. For example, 
    if we connect 4 and 6 first (we get three rope of 3, 2 and 10), then connect 10 and 3 (we gettwo rope of 13 and 2).
    Finally we connect 13 and 2. Total cost in this way is 10 + 13 + 15 = 38.

Input: arr[] = [4, 2, 7, 6, 9]
Output: 62 
Explanation: 
    First, connect ropes 4 and 2, which makes the array [6, 7, 6, 9]. Cost of this operation 4 + 2 = 6. 
    Next, add ropes 6 and 6, which results in [12, 7, 9]. Cost of this operation 6 + 6 = 12.
    Then, add 7 and 9, which makes the array [12,16]. Cost of this operation 7 + 9 = 16. And
    finally, add these two which gives [28]. Hence, the total cost is 6 + 12 + 16 + 28 = 62.
*/

public class MinimumCostofropes {
    public long minCost(long[] arr) {
        /*This is the optimal approach having TC: O(nlogn) and SC: O(n) {n: no of elements} */
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        long cost=0;
        while(!pq.isEmpty()){
            long rope1=pq.poll();
            if(!pq.isEmpty()){
                long rope2=pq.poll();
                long sum=rope1+rope2;
                cost+=sum;
                pq.add(sum);
            }
        }
        return cost;
    }
    public static void main(String[] args) {
        long[] arr = {4, 3, 2, 6};
        MinimumCostofropes obj=new MinimumCostofropes();
        long cost = obj.minCost(arr);
        System.out.println("Minimum cost to connect ropes: " + cost);
    }
}

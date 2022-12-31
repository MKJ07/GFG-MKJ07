import java.util.*;
/*Code Link:-https://practice.geeksforgeeks.org/problems/af49b143a4ead583e943ca6176fbd7ea55b121ae/1
Input: N = 3
start[] = {1, 2, 3}
end[] = {4, 4, 6}
Output: 3
Explanation: We can clearly see that everyone's supposed to
be doing their job at time 3. So, 3 laptops
will be required at minimum.
Input: N = 3
start[] = {1, 5, 2}
end[] = {2, 6, 3}
Output : 1
Explanation: All jobs can be done using 1 laptop only.
 */
public class minimum_number_of_Laptops_required {
    public int minLaptops(int n, int[] start, int[] end) {
        // code here
        
        int ans=1;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i]=new int[]{start[i],end[i]};
        }
        
        Arrays.sort(arr,(a,b)->{
            if(a[0]!=b[0])return a[0]-b[0];
            return a[1]-b[1];
        });
        pq.add(arr[0][1]);
        int i=1;
        while(i<n){
            int d=arr[i][0];
            int c=arr[i][1];
            if(pq.peek()<=d){
                pq.remove();
            }else{
                ans++;
            }
            pq.add(c);
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int N = 3;
        int start[] = {1, 2, 3};
        int end[] = {4, 4, 6};
        minimum_number_of_Laptops_required t=new minimum_number_of_Laptops_required();
        System.out.println(t.minLaptops(N, start, end));
    }
}

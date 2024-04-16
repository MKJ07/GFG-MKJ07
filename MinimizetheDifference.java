import java.util.HashMap;
import java.util.TreeSet;
/*Question: Minimize the Difference. 
Link: https://www.geeksforgeeks.org/problems/minimize-the-difference/1

Example 1:
Input:
n = 5
k = 3
arr = {1, 2, 3, 4, 5}
Output: 
1
Explanation: 
We can remove first subarray of length 3(i.e. {1, 2, 3}) then remaining array will be {4,5} and the difference of maximum and minimum element will be 1 i.e 5 - 4 = 1

Example 2:
Input:
n = 6
k = 3
arr = {2, 3, 1, 4, 6, 7}
Output: 
2
Explanation:
If we remove the subarray {2,3,1} then remaining array will be {4,6,7} and the difference  = 7-4 = 3
If we remove the subarray {3,1,4} then remaining array will be {2,6,7} and the difference  = 7-2 = 5
If we remove the subarray {1,4,6} then remaining array will be {2,3,7} and the difference  = 7-2 = 5
If we remove the subarray {4,6,7} then remaining array will be {2,3,1} and the difference  = 3-1 = 2
So the answer will be min(3,5,5,2) = 2
*/

public class MinimizetheDifference {
    public static int minimizeDifference(int n, int k, int[] arr) {
        /*This appraoch has TC: O(n^2) {when using set} & O(nlogn) {when using TreeSet} and SC: O(n) */
        // Set<Integer> st=new HashSet<>(); {we can also use set}
        TreeSet<Integer> st=new TreeSet<>();
        for(int i:arr){
            st.add(i);
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:arr){
            if(h.containsKey(i)){
                h.put(i,h.get(i)+1);
            }
            else{
                h.put(i,1);
            }
        }
        
        int s=0,e=0;
        for(e=0;e<k;e++){
            int ele=arr[e];
            h.put(ele,h.get(ele)-1);
            if(h.get(ele)==0)
                st.remove(ele);
        }
        // int ans=Collections.max(st)-Collections.min(st); {this should be considered when using set}
        int ans=st.last()-st.first();
        while(e<n){
            int ele1=arr[s];
            int ele2=arr[e];
            h.put(ele1,h.get(ele1)+1);
            st.add(ele1);
            
            h.put(ele2,h.get(ele2)-1);
            if(h.get(ele2)==0)
                st.remove(ele2);
            s++;
            e++;
            // ans=Math.min(ans,Collections.max(st)-Collections.min(st));
            ans=Math.min(ans,st.last()-st.first());
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 3;
        int minDiff = minimizeDifference(n, k, arr);
        System.out.println("Minimum difference after removal: " + minDiff);
    }
}

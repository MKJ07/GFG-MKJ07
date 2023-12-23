import java.util.HashMap;
import java.util.Map;
/*Question: Count More than n/k Occurences.
Link: https://www.geeksforgeeks.org/problems/count-element-occurences/1

Input:
N = 8
arr = [3,1,2,2,1,2,3,3]
k = 4
Output: 
2
Explanation: 
In the given array, 3 and 2 are the only elements that appears more than n/k times
*/
public class CountMorethanNbyKOccurences {
    public static int countOccurence(int[] arr, int n, int k) 
    {
        /*This approach has TC: O(2n) and SC: O(n) */
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h1.containsKey(arr[i])){
                h1.put(arr[i],h1.get(arr[i])+1);
            }
            else{
                h1.put(arr[i],1);
            }
        }
        int t=n/k,cnt=0;
        for(Map.Entry<Integer,Integer> map:h1.entrySet()){
            if(map.getValue()>t)
                cnt++;
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 4, 4, 6, 6, 6 };
        int n = arr.length;
        int k = 4;
        System.out.println(countOccurence(arr, n, k));
    }

}

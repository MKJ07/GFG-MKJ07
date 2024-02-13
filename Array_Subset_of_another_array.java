import java.util.HashMap;
/*Question: Array Subset of another array.
Link: https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1

Input:
a1[] = {1, 2, 3, 4, 4, 5, 6}
a2[] = {1, 2, 4}
Output:
Yes
Explanation:
a2[] is a subset of a1[]
*/
public class Array_Subset_of_another_array {
    public String isSubset( long a1[], long a2[], long n, long m) {
        /*This approach has TC: O(m+n) and SC: O(m) */
        HashMap<Long,Long> h1=new HashMap<>();
        for(int i=0;i<n;i++){
            long l=Long.valueOf(a1[i]);
            if(h1.containsKey(l)){
                h1.put(l,h1.get(a1[i])+1);
            }
            else{
                h1.put(l,1L);
            }
        }
        int cnt=0;
        for(int i=0;i<m;i++){
            if(h1.containsKey(a2[i])){
                if(h1.get(a2[i])>=1){
                    h1.put(a2[i],h1.get(a2[i])-1);
                    cnt++;
                }
                else{
                    h1.remove(a2[i]);
                }
            }
        }
        return cnt==m?"Yes":"No";
        
    }
}

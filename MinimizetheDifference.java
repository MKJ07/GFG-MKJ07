import java.util.HashMap;
import java.util.TreeSet;

public class MinimizetheDifference {
    public static int minimizeDifference(int n, int k, int[] arr) {
        // Set<Integer> st=new HashSet<>();
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
        // int ans=Collections.max(st)-Collections.min(st);
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

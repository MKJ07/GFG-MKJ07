<<<<<<< HEAD
import java.util.*;
/*Code Link:-https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1?page=1&curated[]=1&sortBy=submissions
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
4
*/
public class First_element_to_occur_k_times {
    public static int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if (map.containsKey(a[i]))
                map.put(a[i], map.get(a[i]) + 1);
            else
                map.put(a[i],1);
            if(map.get(a[i])>=k){
                return a[i];
            }
        }
        return -1;
        
    } 
    public static void main(String[] args) {
        int a[] = {3,4,3,4,4};
        int n=a.length;
        int k=2;
        System.out.println(firstElementKTime(a, n, k));
    }
}

=======
import java.util.*;
/*Code Link:-https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1?page=1&curated[]=1&sortBy=submissions
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
4
*/
public class First_element_to_occur_k_times {
    public static int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if (map.containsKey(a[i]))
                map.put(a[i], map.get(a[i]) + 1);
            else
                map.put(a[i],1);
            if(map.get(a[i])>=k){
                return a[i];
            }
        }
        return -1;
        
    } 
    public static void main(String[] args) {
        int a[] = {3,4,3,4,4};
        int n=a.length;
        int k=2;
        System.out.println(firstElementKTime(a, n, k));
    }
}

>>>>>>> f9abe57b19133f660331820207ada1e8912064e2

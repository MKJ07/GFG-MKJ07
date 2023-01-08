import java.util.*;
/*Question:- Absolute difference divisible by K
 *Link:-https://practice.geeksforgeeks.org/problems/e0059183c88ab680b2f73f7d809fb8056fe9dc43/1
Input:n = 4
arr[] = {1, 2, 3, 4}
k = 2
Output :
2
Explanation:
Valid pairs are (1,3), and (2,4).

Input:n = 3
arr[] = {3, 7, 11}
k = 4
Output:
3
Explanation:
(11-3) = 8 is divisible by 4
(11-7) = 4 is divisible by 4
(7-3) = 4 is divisible by 4
*/
public class Absolute_difference_divisible_by_K {
    static long countPairs(int n, int[] arr, int k) {
		int c=0;
        /*This is the optimize approach of the problem with time complexity: O(n+k) and space: O(k) */
		HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i]%k))
                map.put(arr[i]%k, map.get(arr[i]%k) + 1);
            else
                map.put(arr[i]%k,1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){  
            int f=m.getValue();
            c+=(f*(f-1)/2);
        }
        /*This is the brute force approach of the problem */
		// for(int i=0;i<arr.length-1;i++){
		//     for(int j=i+1;j<arr.length;j++){
		//         int diff=0;
		//         diff=Math.abs(arr[i]-arr[j]);
		//         if((diff%k)==0){
		//             c++;
		//         }
		//     }
		// }
		return c;
	}
    public static void main(String[] args) {
        int n = 10;
        int arr[] = {5,5,10,10,2,1,7,8,9,5};
        int k = 3;
        System.out.println(countPairs(n, arr, k));

    }
}

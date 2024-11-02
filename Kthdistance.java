import java.util.HashMap;
/*Question: Kthdistance.
Link: https://www.geeksforgeeks.org/problems/kth-distance3757/1

Input: arr[] = [1, 2, 3, 4, 1, 2, 3, 4] and k = 3
Output: 
    false
Explanation: 
    All duplicates are more than k distance away.

Input: arr[] = [1, 2, 3, 1, 4, 5] and k = 3
Output: 
    true
Explanation: 
    1 is repeated at distance 3.

Input: arr[] = [6, 8, 4, 1, 8, 5, 7] and k = 3
Output: 
    true
Explanation: 
    8 is repeated at distance 3.
*/

public class Kthdistance {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        /*This approach has TC: O(n) and SC: O(n) {n: no of elements} */
        int n = arr.length;
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (h1.containsKey(arr[i])) {
                if ((i - h1.get(arr[i])) <= k) {
                    return true;
                } else {
                    h1.put(arr[i], i);
                }
            } else {
                h1.put(arr[i], i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5};
        int k = 3;
        
        Kthdistance obj = new Kthdistance();
        boolean result = obj.checkDuplicatesWithinK(arr, k);
        
        System.out.println("Contains duplicates within k distance: " + result);
    }
}

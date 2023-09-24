import java.util.*;

/*Question: Find duplicate in an array
Link: https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1

Input:
N = 4
a[] = {0,3,1,2}
Output: 
-1
Explanation: 
There is no repeating element in the array. Therefore output is -1.
 */
public class Findduplicatesinanarray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        /*
         * This is another method using array instead of hashmap
         * having TC:O(2n) and SC:O(n)
         * int[] temp=new int[n];
         * for(int i=0;i<n;i++){
         * temp[arr[i]]++;
         * }
         * ArrayList<Integer> al=new ArrayList<>();
         * for(int i=0;i<temp.length;i++){
         * if(temp[i]>1){
         * al.add(i);
         * }
         * }
         * if(al.isEmpty())
         * al.add(-1);
         * return al;
         */

        HashMap<Integer, Integer> h1 = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : arr) {
            if (h1.containsKey(i)) {
                h1.put(i, h1.get(i) + 1);
            } else {
                h1.put(i, 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> map : h1.entrySet()) {
            if (map.getValue() > 1) {
                al.add(map.getKey());
                count = 1;
            }
        }
        if (count == 0) {
            al.add(-1);
        }
        Collections.sort(al);
        return al;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 3, 3, 1 };
        ArrayList<Integer> a1 = duplicates(arr, arr.length);
        System.out.println(a1);
    }
}

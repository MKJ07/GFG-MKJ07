import java.util.*;
/*Question: Find missing in second array.
Link: https://www.geeksforgeeks.org/problems/in-first-but-second5423/1

Example 1:
Input: 
n = 6, m = 5
a[] = {1, 2, 3, 4, 5, 10}
b[] = {2, 3, 1, 0, 5}
Output: 
4 10
Explanation: 
4 and 10 are present in first array, but not in second array.

Example 2:
Input: 
n = 5, m = 5
a[] = {4, 3, 5, 9, 11}
b[] = {4, 9, 3, 11, 10}
Output: 
5  
Explanation: 
Second array does not contain element 5.
*/

public class FindMissingInSecondArray {
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        /*This approach has TC: O(n+m) and SC: O(max(n,m)) {n: elements in array a, m: elements in array b } */
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i:b){
            if(h1.containsKey(i))
                h1.put(i,h1.get(i)+1);
            else
                h1.put(i,1);
        }
        for(int i:a){
            if(!h1.containsKey(i)){
                al.add(i);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int[] a={1,4,5,8,7,11,10,25,65};
        int[] b={4,5,8,7,10,65};
        FindMissingInSecondArray obj=new FindMissingInSecondArray();
        System.out.println(obj.findMissing(a, b, a.length, b.length));
    }
}

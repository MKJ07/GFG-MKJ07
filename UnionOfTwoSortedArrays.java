import java.util.*;
/*Question: Union of Two Sorted Arrays.
Link: https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

Example 1:
Input: 
n = 5, arr1[] = {1, 2, 3, 4, 5}  
m = 5, arr2 [] = {1, 2, 3, 6, 7}
Output: 
1 2 3 4 5 6 7
Explanation: 
Distinct elements including both the arrays are: 1 2 3 4 5 6 7.

Example 2:
Input: 
n = 5, arr1[] = {2, 2, 3, 4, 5}  
m = 5, arr2[] = {1, 1, 2, 3, 4}
Output: 
1 2 3 4 5
Explanation: 
Distinct elements including both the arrays are: 1 2 3 4 5.

Example 3:
Input:
n = 5, arr1[] = {1, 1, 1, 1, 1}
m = 5, arr2[] = {2, 2, 2, 2, 2}
Output: 
1 2
Explanation: 
Distinct elements including both the arrays are: 1 2.
*/
public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {  
        /*This approach has TC: O(n+m) and SC: O(n+m) {n: elements in arr1, m: elements in arr2} */
        Set<Integer> st=new TreeSet<>();
        for(int i:arr1){
            if(!st.contains(i))
                st.add(i);
        }
        for(int i:arr2){
            if(!st.contains(i))
                st.add(i);
        }
        ArrayList<Integer> al=new ArrayList<>(st);
        return al;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,5,9,10};
        int arr2[]={1,9,10,12};
        System.out.println(findUnion(arr1, arr2, arr1.length, arr2.length));
    }
}

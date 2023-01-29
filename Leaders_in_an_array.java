import java.util.*;
/*Question: Leaders in an array
Link:-https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
Input: n = 6 A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 as it is greater than all the elements to its right.  Similarly, the next 
leader is 5. The right most element is always a leader so it is also included.

Input: n = 5 A[] = {1,2,3,4,0}
Output: 4 0

*/
public class Leaders_in_an_array {
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        max=arr[n-1];
        list.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int []a={16,17,4,3,5,2};int n=6;
        System.out.println(leaders(a, n));
    }
}

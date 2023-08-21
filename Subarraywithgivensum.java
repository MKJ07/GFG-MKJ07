import java.util.ArrayList;
import java.util.HashMap;
/*Question: Subarray with given sum.
Link: https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
*/
public class Subarraywithgivensum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        HashMap<Integer,Integer> h1=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        /*This is brute force having TC: O(N) SC: O(N)*/
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==s){
                al.add(1);
                al.add(i+1);
                return al;
            }
            if(h1.containsKey(sum-s)){
                al.add(h1.get(sum-s)+2);
                al.add(i+1);
                return al;
            }
            h1.put(sum,i);
        }
        al.add(-1);
        return al;
        
        /*This is brute force having TC: O(n^2) SC: O(N)*/
        // int count=0;
        // for(int i=0;i<n;i++){
        //     int j=i;
        //     int sum=0;
        //     while(j<n){
        //         sum+=arr[j];
        //         if(sum==s){
        //             al.add(i+1);
        //             al.add(j+1);
        //             count=1;
        //             break;
        //         }
        //         j++;
        //     }
        //     if(count==1){
        //         break;
        //     }
            
            
        // }
        // if(count==0){
        //     al.add(-1);
        // }
        // return al;
        
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,7,5};
        int k=12;
        System.out.println(subarraySum(arr, arr.length, k));
    }
}

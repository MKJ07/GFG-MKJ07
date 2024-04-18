/*Question: Two Repeated Elements.
Link: https://www.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1

Example 1:
Input:
n = 4
arr[] = {1,2,1,3,4,3}
Output: 
1 3
Explanation: 
In the given array, 1 and 3 are repeated two times and as 1's second appearance occurs before 2's second appearance, so the output should be 1 3.

Example 2:
Input:
n = 2
arr[] = {1,2,2,1}
Output: 
2 1
Explanation: 
In the given array, 1 and 2 are repeated two times and second occurence of 2 comes before 1. So the output is 2 1.
*/

public class TwoRepeatedElements {
    public int[] twoRepeated(int arr[], int n)
    {
        /*This is the better approach having TC: O(n+2) and SC: O(1) {n: no of elements in the array } */
        int[] visit=new int[n+1];
        int[] res=new int[2];
        int idx=0;
        for(int i=0;i<n+2;i++){
            if(visit[arr[i]]>=1){
                res[idx]=arr[i];
                idx++;
            }
            else{
                visit[arr[i]]++;
            }
        }
        return res;
        
        /*This is the brute force approach having TC: O(n) and SC: O(n) {n: no of elements in the array} 
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i:arr){
            if(h1.containsKey(i))
                h1.put(i,h1.get(i)+1);
            else
                h1.put(i,1);
        }
        int[] visit=new int[n+1];
        int[] res=new int[2];
        int idx=0;
        for(int i=0;i<n+2;i++){
            if(h1.get(arr[i])>1){
                if(visit[arr[i]]>0){
                    res[idx]=arr[i];
                    idx++;
                }
                else
                    visit[arr[i]]++;
            }
        }
        return res; 
        */
    }
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 2, 1, 3, 4, 3};
        TwoRepeatedElements obj=new TwoRepeatedElements();
        int[] repeatedNumbers = obj.twoRepeated(arr, n);

        System.out.println("Repeating numbers: " + repeatedNumbers[0] + " " + repeatedNumbers[1]);
    }
}

/*Question: Sum of Middle elements of two sorted arrays.
Link: https://www.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays2305/1

Input: 
    arr1 = [1, 2, 4, 6, 10], arr2 = [4, 5, 6, 9, 12]
Output: 
    11
Explanation: 
    The merged array looks like [1, 2, 4, 4, 5, 6, 6, 9, 10, 12]. Sum of middle elements is 11 (5 + 6).

Input: 
    arr1 = [1, 12, 15, 26, 38], arr2 = [2, 13, 17, 30, 45]
Output: 
    32
Explanation: 
    The merged array looks like [1, 2, 12, 13, 15, 17, 26, 30, 38, 45]. Sum of middle elements is 32 (15 + 17).
*/

public class SumofMiddleelementsoftwosortedarrays {
    static int[] merge(int []arr1,int []arr2){
        int n=arr1.length;
        int temp[]=new int[n*2];
        int i=0,j=0,idx=0;
        while(i<n && j<n){
            if(arr1[i]<=arr2[j]){
                temp[idx]=arr1[i];
                idx++;
                i++;
            }
            else{
               temp[idx]=arr2[j];
                idx++;
                j++; 
            }
        }
        while(i<n){
            temp[idx]=arr1[i];
            idx++;
            i++;
        }
        while(j<n){
            temp[idx]=arr2[j];
            idx++;
            j++;
        }
        return temp;
        
        
    }
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        /*This approach has TC: O(n) and SC: O(n) { n: no of elements in the array } */
        int arr[]=merge(arr1,arr2);
        int mid=arr.length/2;
        return arr[mid-1]+arr[mid];
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        SumofMiddleelementsoftwosortedarrays obj = new SumofMiddleelementsoftwosortedarrays();
        int sumOfMiddle = obj.SumofMiddleElements(arr1, arr2);
        
        System.out.println("Sum of Middle Elements: " + sumOfMiddle);
    }
}

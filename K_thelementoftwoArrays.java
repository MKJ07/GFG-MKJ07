/*Question: K-th element of two Arrays.
Link: https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1

Example 1:

Input:
    arr1[] = {2, 3, 6, 7, 9}
    arr2[] = {1, 4, 8, 10}
    k = 5
Output:
    6
Explanation:
    The final sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10
    The 5th element of this array is 6.

Example 2:
Input:
    arr1[] = {100, 112, 256, 349, 770}
    arr2[] = {72, 86, 113, 119, 265, 445, 892}
    k = 7
Output:
    256
Explanation:
    Final sorted array is - 72, 86, 100, 112,
    113, 119, 256, 265, 349, 445, 770, 892
    7th element of this array is 256.
*/

public class K_thelementoftwoArrays {
    static int[] merge(int []arr1,int arr2[],int n,int m){
        int idx=0,i=0,j=0;
        int temp[]=new int[n+m];
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                temp[idx]=arr1[i];
                idx++;i++;
            }
            else{
                temp[idx]=arr2[j];
                idx++;j++;
            }
        }
        while(i<n){
            temp[idx]=arr1[i];
            idx++;i++;
        }
        while(j<m){
            temp[idx]=arr2[j];
            idx++;j++;
        }
        return temp;
    }
    
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        /*This approach has TC: O(n+m) and SC: O(n+m) {n: length of arr1, m: length of arr2} */
        int[] sortedArray=merge(arr1,arr2,n,m);
        return sortedArray[k-1];
        
    }
}

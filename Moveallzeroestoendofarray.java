/*Question: Move all zeroes to end of array.
Link: https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1

Input:
N = 4
Arr[] = {0, 0, 0, 4}
Output: 4 0 0 0
Explanation: 4 is the only non-zero
element and it gets moved to the left.
*/
public class Moveallzeroestoendofarray {
    static void pushZerosToEnd(int[] arr, int n) {
        /*This is the optimal approach having TC: O(N) and SC: O(1) */
        int count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < n) {
            arr[count] = 0;
            count++;
        }

        /*This is better approach having TC: O(2N) and SC: O(N) //using an array */
        int[] temp=new int[n];
	    int idx=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]!=0){
	            temp[idx]=arr[i];
	            idx++;
	        }
	    }
	    for(int i=0;i<n;i++){
	        arr[i]=temp[i];
	    }
    }
    public static void main(String[] args) {
        int[] arr={3,2,0,5,6,8,0,1,0,9};
        int n=arr.length;
        pushZerosToEnd(arr, n);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

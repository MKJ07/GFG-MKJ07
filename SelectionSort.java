/*Question: Selection Sort
Link:https://practice.geeksforgeeks.org/problems/selection-sort/0

Input:N = 5 arr[] = {4, 1, 3, 9, 7}
Output: 1 3 4 7 9
Explanation:
Maintain sorted (in bold) and unsorted subarrays.
Select 1. Array becomes 1 4 3 9 7.
Select 3. Array becomes 1 3 4 9 7.
Select 4. Array becomes 1 3 4 9 7.
Select 7. Array becomes 1 3 4 7 9.
Select 9. Array becomes 1 3 4 7 9.
 */
public class SelectionSort {
    static void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n-1;i++){
	        for(int j=i;j<n;j++){
	            if(arr[i]>arr[j]){
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	}
    public static void main(String[] args) {
        int[] arr={5,6,4,7,8,2,3};
        selectionSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

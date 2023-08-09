/*Question: Insertion Sort
 Link:https://practice.geeksforgeeks.org/problems/insertion-sort/1

Input: N = 5 arr[] = { 4, 1, 3, 9, 7}
Output: 1 3 4 7 9

Input: N = 10 arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output: 1 2 3 4 5 6 7 8 9 10
 */
public class InsertionSort {
    static void insert(int arr[],int i)
  {
       // Your code here
       int j=i;
        while(j>0 && arr[j-1]>arr[j]){
          int temp=arr[j-1];
          arr[j-1]=arr[j];
          arr[j]=temp;
          j--;
        }
  }
  //Function to sort the array using insertion sort algorithm.
  public static void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=0;i<n;i++){
          insert(arr,i);
      }
  }
    public static void main(String[] args) {
        int[] arr={5,6,4,7,8,2,3};
        insertionSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

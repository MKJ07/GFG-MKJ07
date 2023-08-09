/*Question: Bubble Sort
Link:https://practice.geeksforgeeks.org/problems/bubble-sort/0

Input: N = 5 arr[] = {4, 1, 3, 9, 7}
Output: 1 3 4 7 9

 */
public class BubbleSort {
    public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,6,4,7,8,2,3};
        bubbleSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

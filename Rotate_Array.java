/*Question: Rotate Array
Link: https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5  when rotated
by 2 elements, it becomes 3 4 5 1 2.
 */
public class Rotate_Array {
    /*This method can be used while doing with recursion its just swapping the elements */
    static void rot(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d=d%n;
        /*This the recursion method to rotate the array */
        // rot(arr,0,n-1);
        // rot(arr,0,n-d-1);
        // rot(arr,n-d,n-1);

        /*This is direct appraoch just taking a new array storing values in it and then again putting it back */
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
    }
    public static void main(String[] args) {
        int[] arr={5,6,4,7,8,2,3};
        rotateArr(arr, 3, arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}

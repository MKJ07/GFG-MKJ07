/*Code Link:-https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1?page=1&curated[]=1&sortBy=submissions
Input:
N = 7
Arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: 3 7 4 8 2 6 1
Input:
N = 4
Arr[] = {1, 4, 3, 2}
Output: 1 4 2 3
 */
public class Convert_array_into_Zig_Zag_fashion {
    void zigZag(int arr[], int n) {
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4, 3, 7, 8, 6, 2, 1};
        int l=arr.length;
        new Convert_array_into_Zig_Zag_fashion().zigZag(arr, l);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

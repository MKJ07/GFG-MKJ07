/*  Input : arr[ ] = {4, 5, 6, 7, 6}, K = 1  and X = 6
    Output : 2 */
public class Searching_in_an_array_K {
    public static int search (int arr[], int n, int x, int k) {
        // for(int i=0;i<n;i++){
        //     if(arr[i]==x){
        //         return i;
        //     }
            
        // }
        /* Optimize way for the Code */
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
            i=i+Math.max(1,Math.abs((arr[i]-x)/k));
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[ ] = {20, 40, 50, 70, 70, 60}, K = 20 , X = 60;
        int n=arr.length;
        System.out.println(search(arr, n, X, K));

        
    }
    
}

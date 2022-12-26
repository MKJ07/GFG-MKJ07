import java.util.Scanner;
/*Code Link:-https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&curated[]=1&sortBy=submissions
 * Input:-N = 5
    ar[] = {1 2 3 4 5} 
    K = 4
 *  N = 5
    ar[] = {11 22 33 44 55} 
    K = 445
    Output:- 3 -1
 */
public class Binary_Search {
    int binarysearch(int arr[], int n, int k) {
        int l=0;
        int r=arr.length;
        int mid=(l+r)/2;
        for(int i=0;i<arr.length;i++){
            mid=(l+r)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                r--;
            }
            else{
                l++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]={1,2,3,4,5};
        int k=5;
        int n=ar.length;
        Binary_Search a=new Binary_Search();
        System.out.println(a.binarysearch(ar, n, k));
        sc.close();
    }
}

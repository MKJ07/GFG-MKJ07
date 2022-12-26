import java.util.*;
/* Code Link:-https://practice.geeksforgeeks.org/problems/maximize-toys0331/1?page=1&difficulty[]=0&status[]=unsolved&curated[]=1&sortBy=submissions
N = 3 
K = 100
arr[] = {20, 30, 50}
 */
public class Maximize_Toys {
    static int toyCount(int N, int K, int arr[])
    {
        int s=0,c=0;
        Arrays.sort(arr);
        if(s>=K)
            return 0;
        for(int i=0;i<N;i++){
            s+=arr[i];
            if(s<=K)
                c++;
            else
                break;
        }
        return c;
    }

    public static void main(String[] args) {
        int N = 7 ;
        int K = 50;
        int arr[] = {1, 12, 5, 111, 200, 1000, 10};
        System.out.println(toyCount(N, K, arr));
    }
}
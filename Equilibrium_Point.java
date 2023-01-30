/*Question: Equilibrium Point.
Link:-https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1

Input: n = 5 A[] = {1,3,5,2,2}.
Output: 3 
Explanation: equilibrium point is at position 3 as elements before it (1+3) = elements after it (2+2). 

Input: n = 1 A[] = {1}.
Output: 1
Explanation: Since its the only element hence its the only equilibrium point.
Input:  n = 2 A[] = {26,26}.
Output: -1
Explanation: Since there cannot be any midpoint.
*/
public class Equilibrium_Point {
    public static int equilibriumPoint(long arr[], int n) {
        int leftsum=(int)arr[0];
        int rightsum=(int)arr[n-1];
        int s=1;
        int l=n-2;
        if(n==1){
            return 1;
        }
        if(n==2 && leftsum==rightsum){
            return -1;
        }
        while(s<l){
            if(leftsum<rightsum){
                leftsum+=arr[s];
                s++;
            }else{
                rightsum+=arr[l];
                l--;
            }
        }
        if(leftsum!=rightsum){
            return -1;
        }
        return s+1;
    }
    static int leftSum(long arr[],int l){
        int lsum=0;
        int i=0;
        // {1,3,5,2,2};
        while(i<l){
            lsum+=arr[i];
            i++;
        }
        return lsum;
        
    }
    static int rightSum(long arr[], int r){
        int rsum=0;
        int l=arr.length;
        // {1,3,5,2,2};
        while(r<l){
            rsum+=arr[r];
            r++;
        }
        return rsum;
        
    }
    /*Another way for the solution */
     // Function to find equilibrium point in the array.
    // static int leftSum(long arr[],int l){
    //     int lsum=0;
    //     int i=0;
    //     while(i<l){
    //         lsum+=arr[i];
    //         i++;
    //     }
    //     return lsum;
        
    // }
    // static int rightSum(long arr[], int r){
    //     int rsum=0;
    //     int l=arr.length;
    //     while(r<l){
    //         rsum+=arr[r];
    //         r++;
    //     }
    //     return rsum;
        
    // }
    // public static int equilibriumPoint(long arr[], int n) {
    //     int sum1=0,sum2=0;
    //     if(n==1){
    //         // int ans=(int)arr[0];
    //         return 1;
    //     }
    //     // if(n==2 && arr[0]==arr[1]){
    //     //     return -1;
    //     // }
    //     int i=0;
    //     while(i<n){
    //         int l=leftSum(arr,i+1);
    //         // System.out.println(l);
    //         int r=rightSum(arr,i+2);
    //         // System.out.print(l+" "+r);
    //         // System.out.println();
    //         if(l==r){
    //             return i+2;
    //         }
    //         i++;
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        long[] arr={1,3,5,2,2};
        int n=arr.length;
        System.out.println(equilibriumPoint(arr, n));
    }
    
}

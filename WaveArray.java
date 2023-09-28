/*Question: Wave Array.
Link: https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1

Input:
n = 6
arr[] = {2,4,7,8,9,10}
Output: 4 2 8 7 10 9
Explanation: Array elements after 
sorting it in wave form are 
4 2 8 7 10 9.
 */
public class WaveArray {
    public static void convertToWave(int n, int[] a) {
        for(int i=1;i<n;i++){
            if((i-1)%2==0){
                if(a[i-1]<a[i]){
                    int temp=a[i];
                    a[i]=a[i-1];
                    a[i-1]=temp;
                }
            }
            else{
                if(a[i-1]>a[i]){
                    int temp=a[i];
                    a[i]=a[i-1];
                    a[i-1]=temp; 
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={2,2,4,3,5,6,9};
        convertToWave(a.length, a);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}

public class SumofXORofallpairs {
    public long sumXOR(int arr[], int n) {
        /*This is the brute approach having TC:O(N^2) and SC:O() only one test case not passed
        int i=0;
        long sum=0;
        while(i<n-1){
        int j=i+1;
        while(j<n){
        sum+=(arr[i]^arr[j]);
        j++;

        }
        i++;
        }
        return sum;*/
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,4,9};
        int n=arr.length;
        SumofXORofallpairs obj=new SumofXORofallpairs();
        System.out.println(obj.sumXOR(arr, n));
    }
}

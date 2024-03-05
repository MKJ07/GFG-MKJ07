public class MaximumIndex {
    static int maxIndexDiff(int a[], int n) {
        /*This is a better approach having TC: O(~n) and SC: O(1) */
        int max=Integer.MIN_VALUE;
        int left=0,right=n-1;
        while(left<=right){
            if(a[left]<=a[right]){
                int temp=right-left;
                max=Math.max(max,temp);
                left++;
                right=n-1;
            }
            else{
                right--;
            }
        }

        /*This is the brute force approach having TC: O(n^2) and SC: O(1)
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]<=a[j] && i<j){
                    int temp=j-i;
                    max=Math.max(max,temp);
                }
            }
        }*/
        return max;
    }
    public static void main(String[] args) {
        int[] arr={34,5,4,8,25,1,4,56,8,45,2};
        int n=arr.length;
        System.out.println(maxIndexDiff(arr, n));
    }
}

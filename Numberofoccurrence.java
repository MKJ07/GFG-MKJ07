public class Numberofoccurrence {
    static int count(int[] arr, int n, int x) {
        // code here
        int count=0;
        for(int i:arr){
            if(i==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []nums={1,2,3,2,4,2,2,5};
        System.out.println(count(nums, nums.length, 2));

    }
}

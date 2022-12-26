public class Ceiling_In_A_Sorted_Array {
    static int ceilSearch(int arr[], int x){
        if(x<=arr[0]){
            return 0;
        }
        for(int i=1;i<arr.length-1;i++){
            if(x>arr[i] && x<=arr[i+1]){
                return i+1;

            }
        }
        return -1;


    }
    public static void main(String[] args) {

        int[] a={1, 2, 8, 10, 10, 12, 19};
        int x=5;
        System.out.println(ceilSearch(a,x));



        
    }
    
}

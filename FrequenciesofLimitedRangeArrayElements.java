public class FrequenciesofLimitedRangeArrayElements {
    public static void frequencyCount(int arr[], int N, int P)
    {
        int size=Math.max(P,N);
        int [] temp=new int[size+1];
        for(int i=0;i<N;i++){
            temp[arr[i]]++;
        }
        for(int i=0;i<N;i++){
            arr[i]=temp[i+1];
        }
    }
    public static void main(String[] args) {
        int N = 5,P=5;
        int arr[] = {2, 3, 2, 3, 5};
        frequencyCount(arr, N, P);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

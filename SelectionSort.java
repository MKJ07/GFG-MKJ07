public class SelectionSort {
    static void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n-1;i++){
	        for(int j=i;j<n;j++){
	            if(arr[i]>arr[j]){
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	}
    public static void main(String[] args) {
        int[] arr={5,6,4,7,8,2,3};
        selectionSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

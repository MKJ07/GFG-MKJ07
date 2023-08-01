class Minimumelementinasortedandrotatedarray {
    static int findMin(int arr[], int n)
    {
        //complete the function here
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min)
                min=i;
        }
        return min;
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {4 ,5 ,1 ,2 ,3};
        System.out.println(findMin(arr, N));

    }

    
}

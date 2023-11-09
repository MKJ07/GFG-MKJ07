public class PredicttheColumn {
    static int columnWithMaxZeros(int arr[][], int N)
    {
        int maxe=-1;
        int idx=0;
        int m=arr[0].length;
        for(int i=0;i<N;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                if(arr[j][i]==0){
                    cnt++;
                }
            }
            if(cnt>maxe){
                maxe=cnt;
                idx=i;
            }
        }
        if(idx==0){
            return -1;
        }
        return idx;
        
    }
    public static void main(String[] args) {
        int N = 3;
        int[][] M = {
            {0, 1, 0},
            {1, 0, 0},
            {0, 1, 0}
        };
        System.out.println(columnWithMaxZeros(M, N));
    }
}

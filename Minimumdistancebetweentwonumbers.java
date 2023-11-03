public class Minimumdistancebetweentwonumbers {
    static int minDist(int a[], int n, int x, int y) {
        /*This is the brute force approach having TC: O(n^2) and SC: O(1)
        int minN=Integer.MAX_VALUE;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==x && a[j]==y){
                    int diff=0;
                    if(i>j)
                        diff=i-j;
                    else 
                        diff=j-i;
                    minN=Math.min(minN,diff);
                    c=1;
                }
            }
        }
        if(c==0){
            return -1;
        }
        return minN;
        */
    }

    public static void main(String[] args) {
        int N = 7;
        int A[] = {86,39,90,67,84,66,62};
        int x = 42, y = 12;
        System.out.println(minDist(A, N, x, y));
    }
}

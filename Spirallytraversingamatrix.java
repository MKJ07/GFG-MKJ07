import java.util.ArrayList;
/*Question: Spirally traversing a matrix.
Link: https://www.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

Input: 
    matrix[][] = [[1, 2, 3, 4],
                  [5, 6, 7, 8],
                  [9, 10, 11, 12],
                  [13, 14, 15,16]]
Output: 
    [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]

Input: 
    matrix[][] = [[1, 2, 3, 4],
                  [5, 6, 7, 8],
                  [9, 10, 11, 12]]
Output: 
    [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
Explanation: 
    Applying same technique as shown above, output for the 2nd testcase will be 1 2 3 4 8 12 11 10 9 5 6 7.
*/

public class Spirallytraversingamatrix {
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        /*This approach has TC: O(n×m) and SC: O(n×m) {n: no of rows, m: no of columns }  */
        ArrayList<Integer> al = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return al;

        int n = matrix.length;    
        int m = matrix[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                al.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                al.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    al.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    al.add(matrix[i][left]);
                }
                left++;
            }
        }

        return al;

        /*I tried in this way also but edge case failed */
        // ArrayList<Integer> al=new ArrayList<>();
        // int i=0,j=0;
        // int n=matrix.length;
        // int m=matrix[0].length;
        // if(n==1 || m==1){
        //     if(n==1){
        //         int k=0;
        //         while(k<m){
        //             al.add(matrix[0][k]);
        //             k++;
        //         }
        //         return al;
        //     }else{
        //         int k=0;
        //         while(k<n){
        //             al.add(matrix[k][0]);
        //             k++;
        //         }
        //         return al;
        //     }
        // }
        
        // while(matrix[i][j]!=0){
        //     while(j<m && matrix[i][j]!=0){
        //         al.add(matrix[i][j]);
        //         matrix[i][j]=0;
        //         j++;
        //     }
        //     j-=1;i+=1;
        //     while(i<n && matrix[i][j]!=0){
        //         al.add(matrix[i][j]);
        //         matrix[i][j]=0;
        //         i++;
        //     }
        //     i-=1;j-=1;
        //     while(j>=0 && matrix[i][j]!=0){
        //         al.add(matrix[i][j]);
        //         matrix[i][j]=0;
        //         j--;
        //     }
        //     j+=1;i-=1;
        //     while(i>0 && matrix[i][j]!=0){
        //         al.add(matrix[i][j]);
        //         matrix[i][j]=0;
        //         i--;
        //     }
        //     i++;
        //     j++;
        // }
        // return al;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        Spirallytraversingamatrix obj=new Spirallytraversingamatrix();
        ArrayList<Integer> result = obj.spirallyTraverse(matrix);
        System.out.println("Spiral Order: " + result);
    }
            
}

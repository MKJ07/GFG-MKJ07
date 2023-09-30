/*Question: Boolean Matrix.
Link: https://practice.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/1

Input:
R = 4, C = 3
matrix[][] = {{ 1, 0, 0},
              { 1, 0, 0},
              { 1, 0, 0},
              { 0, 0, 0}}
Output: 
1 1 1
1 1 1
1 1 1
1 0 0 
Explanation:
The position of cells that have 1 in
the original matrix are (0,0), (1,0)
and (2,0). Therefore, all cells in row
0,1,2 are and column 0 are modified to 1.
 */
public class BooleanMatrix {
    void booleanMatrix(int matrix[][])
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,0,0},{0,1,0},{0,0,0}};
        int n=matrix.length;
        int m=matrix[0].length;
        BooleanMatrix t=new BooleanMatrix();
        t.booleanMatrix(matrix);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}

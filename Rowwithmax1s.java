/*Question: Row with max 1s.
Link: https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1

Input: arr[][] = [[0, 1, 1, 1],
               [0, 0, 1, 1],
               [1, 1, 1, 1],
               [0, 0, 0, 0]]
Output: 2
Explanation: 
    Row 2 contains 4 1's (0-based indexing).

Input: arr[][] = [[0, 0], 
               [1, 1]]
Output: 1
Explanation: 
    Row 1 contains 2 1's (0-based indexing).
*/
public class Rowwithmax1s {
    public int rowWithMax1s(int arr[][]) {
        /*This approach has TC: O(NxM) and SC: O(1) { N: no of rows, M: no of columns } */
        int maxOne=0;
        int idx=-1;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    cnt++;
                }
            }
            if(cnt>maxOne){
                idx=i;
                maxOne=cnt;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };
        Rowwithmax1s obj=new Rowwithmax1s();
        int rowWithMaxOnes = obj.rowWithMax1s(arr);
        System.out.println("Row with the maximum number of 1s: " + rowWithMaxOnes);
    }
}

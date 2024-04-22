/*Question: Row with minimum number of 1's.
Link: https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1

Example 1:
Input:
n = 4,m = 4
a = [[1, 1, 1, 1],
     [1, 1, 0, 0], 
     [0, 0, 1, 1],
     [1, 1, 1, 1]]
Output:
2
Explanation:
Rows 2 and 3 contain the minimum number 
of 1's(2 each).Since,row 2 is less than row 3.
Thus, the answer is 2.

Example 2:
Input:
n = 3,m = 3
a = [[0, 0, 0],
     [0, 0, 0],
     [0, 0, 0]]
Output:
1
Explanation:
All the rows contain the same number 
of 1's(0 each).Among them, index 1 
is the smallest, so the answer is 1.
*/

public class Rowwithminimumnumberof1s {
    int minRow(int n, int m, int a[][]) {
        /*
         * This approach has TC: O(n*m) and SC: O(1) {n: no of rows in the matrix, m: no
         * of columns in the matrix}
         */
        int row = 0, cnt = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1)
                    temp += 1;
            }
            if (temp < cnt) {
                row = i;
                cnt = temp;
            }
        }
        return row + 1;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 1, 0 },
                { 0, 0, 1 },
                { 1, 1, 0 }
        };
        int n = matrix.length;
        int m = matrix[0].length;
        Rowwithminimumnumberof1s obj = new Rowwithminimumnumberof1s();
        System.out.println(obj.minRow(n, m, matrix));
    }
}

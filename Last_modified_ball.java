/*Question:- Last_modified_ball
 *Link:-https://practice.geeksforgeeks.org/problems/33af95e5935f1f2a0c3f5083c4b9d0db68e97bd4/1

Input:N = 4, A[] = {3, 1, 4, 5}
Output:4
Explanation:The last bowl has 5 marbels, we can just add the marbel here.

Input: N = 3, A[] = {1, 9, 9}
Output: 1
Explanation: When we add the marbel to last bowl we have to move one marbel to 2nd bowl,to add the marbel in 2nd bowl we have 
to move one marbel to 1st bowl.Hence the last modified bowl is 1.
*/
public class Last_modified_ball {
    int solve(int N, int[] A) {
        for(int i=N-1;i>=0;i--){
            if(A[i]<9)
                return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3, 1, 4, 5};
        int n=arr.length;
        Last_modified_ball t=new Last_modified_ball();
        System.out.println(t.solve(n, arr));
    }
}

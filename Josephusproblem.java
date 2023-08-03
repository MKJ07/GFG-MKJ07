/*Question : Josephus problem
Link:https://practice.geeksforgeeks.org/problems/josephus-problem/1

Input:
n = 3 k = 2
Output: 3
Explanation: There are 3 persons so 
skipping 1 person i.e 1st person 2nd 
person will be killed. Thus the safe 
position is 3.
 */
public class Josephusproblem {
    public static int josephus(int n, int k)
    {
        //Your code here
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        int index=0;
        while(n>1){
            index=(index+k-1)%n;
            for(int i=index;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            n--;
        }
        return arr[0];
        // if (n == 1) {
        //     return 1;
        // }
        // return (josephus(n - 1, k) + k - 1) % n + 1;
        
    }
    public static void main(String[] args) {
        System.out.println(josephus(7, 3));
    }
}

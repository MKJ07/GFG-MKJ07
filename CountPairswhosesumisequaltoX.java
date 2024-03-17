import java.util.*;
/*Question: Count Pairs whose sum is equal to X.
Link: https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1

Example 1:
Input:
head1 = 1->2->3->4->5->6
head2 = 11->12->13
x = 15
Output: 3
Explanation: There are total 3 pairs whose sum is 15 : (4,11) , (3,12) and (2,13)

Example 2:
Input:
head1 = 7->5->1->3
head2 = 3->5->2->8
x = 10
Output: 2
Explanation: There are total 2 pairs whose sum is 10 : (7,3) and (5,5)
*/

public class CountPairswhosesumisequaltoX {
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,int x) {
        /*This is the optimal approach having TC:O(n) and SC: O(n) {n: no of elements} */
        int cnt=0;
        HashSet<Integer> set = new HashSet<>(head2);
        for (int num : head1) {
            if (set.contains(x - num)) {
                cnt++;
            }
        }
        return cnt;

        /*This is a better approach having TC: O(nlogn) and SC:O(1) {n: no of elements} 
        int cnt=0;
        int left=0,right=head2.size()-1;
        Collections.sort(head1);
        Collections.sort(head2);
        while(left<head1.size() && right>=0){
            int sum=head1.get(left)+head2.get(right);
            if(sum==x){
                cnt++;
                left++;
                right--;
            }
            else if(sum<x){
                left++;
            }
            else{
                right--;
            }
        }
        return cnt++; */


        /*This is the brute force approach having TC: O(n^2) and SC: O(1) {n: no of elements} 
        int cnt=0;
        for(int i=0;i<head1.size();i++){
            for(int j=0;j<head2.size();j++){
                if((head1.get(i)+head2.get(j))==x){
                    cnt++;
                }
            }
        }
        return cnt; */
    }
    public static void main(String[] args) {
        LinkedList<Integer> head1 = new LinkedList<>();
        head1.add(1);
        head1.add(2);
        head1.add(3);
        head1.add(4);

        LinkedList<Integer> head2 = new LinkedList<>();
        head2.add(5);
        head2.add(6);
        head2.add(7);
        head2.add(8);

        int x = 10;
        int count =countPairs(head1, head2, x);
        System.out.println("Number of pairs with sum equal to " + x + ": " + count);
    }
}

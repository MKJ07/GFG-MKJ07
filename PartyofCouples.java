import java.util.HashMap;
/*Question: Party of Couples.
Link: https://www.geeksforgeeks.org/problems/alone-in-couple5507/1

Example 1:
Input: 
n = 5
arr = {1, 2, 3, 2, 1}
Output: 
3
Explaination: Only the number 3 is single.

Example 2:
Input: 
n = 11 
arr = {1, 2, 3, 5, 3, 2, 1, 4, 5, 6, 6} 
Output: 
4 
Explaination: 4 is the only single.
*/
public class PartyofCouples {
    static int findSingle(int n, int arr[]){
        /*This approach has TC: O(n) and SC: O(n) {n: no of elements in the array} */
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i:arr){
            if(h1.containsKey(i))
                h1.put(i,h1.get(i)+1);
            else
                h1.put(i,1);
        }
        for(int i:arr){
            if(h1.get(i)%2!=0)
                return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 3, 4, 4};
        int n = arr.length;
        System.out.println(findSingle(n, arr));
    }
}

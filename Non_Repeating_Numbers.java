import java.util.*;
/*Question: Non Repeating Numbers.
Link: https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1

Input: 
N = 2
arr[] = {1, 2, 3, 2, 1, 4}
Output:
3 4 
Explanation:
3 and 4 occur exactly once.
*/
public class Non_Repeating_Numbers {
    public int[] singleNumber(int[] nums)
    {
        // Code here
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h1.containsKey(nums[i])){
                h1.put(nums[i],h1.get(nums[i])+1);
            }
            else{
                h1.put(nums[i],1);
            }
        }
        int[] res=new int[2];int i=0;
        for(Map.Entry<Integer,Integer> map:h1.entrySet()){
            if(map.getValue()==1){
                res[i]=map.getKey();
                i++;
            }
            if(i>2){
                break;
            }
        }
        Arrays.sort(res);
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {18, 24, 24, 21, 10, 29, 8, 10, 29, 18};
        Non_Repeating_Numbers t=new Non_Repeating_Numbers();
        int[] res=t.singleNumber(nums);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}

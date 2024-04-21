/*Question: Three way partitioning.
Link: https://www.geeksforgeeks.org/problems/three-way-partitioning/1

Example 1:
Input: 
n = 5
array[] = {1, 2, 3, 3, 4}
[a, b] = [1, 2]
Output: 
1
Explanation: 
One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be 1.

Example 2:
Input: 
n = 6 
array[] = {1, 4, 3, 6, 2, 1}
[a, b] = [1, 3]
Output: 
1
Explanation: 
One possible arrangement is: {1, 3, 2, 1, 4, 6}. If you return a valid arrangement, output will be 1.
*/

public class ThreeWayPartitioning {
    public void threeWayPartition(int array[], int a, int b)
    {
        /*This is the optimal approach having TC: O(n) and SC: O(1) {n: elements in the array} */
        int n=array.length;
        int end=n-1,st=0,i=0;
        while(i<=end){
            if(array[i]<a){
                int temp=array[i];
                array[i]=array[st];
                array[st]=temp;
                st++;
                i++;
            }
            else if(array[i]>b){
                int temp=array[i];
                array[i]=array[end];
                array[end]=temp;
                end--;
            }
            else    
                i++;
        }
        
        /*This is the brute force approach having TC: O(nlogn) and SC: O(1) {n: elements in the array (for sorting it taking nlogn )}
        Arrays.sort(array);
        int n=array.length;
        int end=n-1;
        int st=0;
        for(int i=0;i<n;i++){
            if(array[i]<a){
                int temp=array[i];
                array[i]=array[st];
                array[st]=temp;
                st++;
            }
            else if(array[i]>b){
                int temp=array[i];
                array[i]=array[end];
                array[end]=temp;
                end--;
            }
        }
        */
    }
    public static void main(String[] args) {
        int array[]={1,4,5,8,7,9,5,2,1,4,5,6};
	    int a=4,b=8;
        ThreeWayPartitioning obj =new ThreeWayPartitioning();
        obj.threeWayPartition(array, a, b);
        for(int k:array){
            System.out.print(k+" ");
        }
    }
}

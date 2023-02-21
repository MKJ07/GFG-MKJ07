/*Question: Search in a Rotated Array
Link:-https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1

Input: N = 9 A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
key = 10
Output: 5
Explanation: 10 is found at index 5.

Input: N = 4 A[] = {3, 5, 1, 2}
key = 6
Output: -1
Explanation: There is no element that has value 6.
 */
public class Search_in_a_Rotated_Array {
    int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int k=10;
        Search_in_a_Rotated_Array t=new Search_in_a_Rotated_Array();
        System.out.println(t.search(nums, k, k, k));

    }
}

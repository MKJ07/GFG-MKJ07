/*Question :Minimum element in a sorted and rotated array
Link : https://practice.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1

Input:
N = 7
arr[] = {10, 20, 30, 40, 50, 5, 7}
Output: 5
Explanation: Here 5 is the minimum element.
*/
class Minimumelementinasortedandrotatedarray {
    static int findMin(int arr[], int n)
    {
        //complete the function here
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min)
                min=i;
        }
        return min;
    }
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {4 ,5 ,1 ,2 ,3};
        System.out.println(findMin(arr, N));

    }

    
}

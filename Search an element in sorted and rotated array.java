/*Question:-Search an element in sorted and rotated array
Link:-https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array0959/1 

Input:
N = 9
A[] = {5,6,7,8,9,10,1,2,3}
K = 10
Output: 5
Explanation: 10 is found at index 5.
*/
class rotated_array {
    static int Search(int array[], int target)
	{
	    // code here
	    for(int i=0;i<array.length;i++){
	        if(array[i]==target)
	            return i;
	    }
	    return -1;
	}
    public static void main(String[] args) {
        int N = 9;
        int A[] = {5,6,7,8,9,10,1,2,3};
        System.out.println(Search(A, N));

    }
    
}

import java.util.*;
/*Code Link:-https://practice.geeksforgeeks.org/problems/k-largest-elements3736/1
Input: N = 5, k = 2
arr[] = {12,5,787,1,23}
Output: 787 23
Explanation: First largest element in
the array is 787 and the second largest
is 23.
Input: N = 7, k = 3
arr[] = {1,23,12,9,30,2,50}
Output: 50 30 23
 */
public class K_largest_elements {
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
	    for(int i=0;i<n;i++){
	        numbers.add(arr[i]);
	    }
	    for(int i=0;i<n-k;i++){
	        numbers.remove();
	    }
	    ArrayList<Integer> a1=new ArrayList<Integer>();
	    while(!numbers.isEmpty()){
	        a1.add(numbers.peek());
	        numbers.remove();
	    }
	    Collections.reverse(a1);
	    return a1;
        
    }
    public static void main(String[] args) {
	    int[] arr={12,5,787,1,23};
	    int n=5,k=2;
        System.out.println(kLargest(arr, n, k)); 
    }
}

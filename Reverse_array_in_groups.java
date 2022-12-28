import java.util.*;
/*Code Link:-https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.
Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
*/
public class Reverse_array_in_groups {
    static void swap(ArrayList<Integer> arr, int n,int k,int d){
        int[] a=new int[d];
        for(int i=0;i<n;i++){
            a[i]=arr.get(i);
            
        }
        int l=k;
	    int j=n-1;
	    while(l<j){
	        int t=a[l];
	        a[l]=a[j];
	        a[j]=t;
	        l++;j--;
	    }
        for(int i=k;i<n;i++){
            arr.set(i,a[i]);
        }
    }
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int d=k;
	    for(int i=0;i<n;i+=k){
	        if(d>=n){
	            d=n;
	            swap(arr,d,i,n);
	        }
	        else{
	            swap(arr,d,i,n);
	            d+=k;
	        }   
	    }
    }
    public static void main(String[] args) {
	    ArrayList<Integer> arr = new ArrayList<Integer>(); 
	    arr.add(1);
	    arr.add(2);
	    arr.add(3);
	    arr.add(4);
	    arr.add(5);
	    arr.add(6);
	    arr.add(7);
	    arr.add(8);
	    int n=8,k=3;int d=k;
	    for(int i=0;i<n;i+=k){
	        if(d>=n){
	            d=n;
	            swap(arr,d,i,n);
	        }
	        else{
	            swap(arr,d,i,n);
	            d+=k;
	        }   
	    }
	    for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
	    
		
	}
}
